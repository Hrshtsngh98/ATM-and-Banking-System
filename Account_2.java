public class Account_2 {
	Data ds;			//declaring data structure object
	MDA_EFSM mda;		//declaring MDA_EFSM object
	Abstract_Factory af;	//Declaring abstract factory object

	public Account_2() 
	{
    	af=new Account_Factory_2();		//initializing the object
    	ds = af.SetDataObject();		//initializing the object
    	mda=new MDA_EFSM(ds,"Account2");	//initializing the object and calling parameterized contructor and passing data structure object and Account name
    }
    public void OPEN(int p, int y, int a) {
        ((DS_2)ds).setdata(p,y,a);   //type casting and call function to store data
    	mda.Open();	
    }
    public void PIN(int x) {
    	if(x==((DS_2)ds).getpin())		//checking the pin in case of logging in.
        	mda.CorrectPinAboveMin();	//checking for going to ready or overdrawn state
        else 
        	mda.IncorectPin(2);		//calling in case of of wrong pin
    }
    public void DEPOSIT(int d) {
    	((DS_2)ds).setd(d);
        	mda.Deposit();		//calling deposit 
    }
    public void WITHDRAW(int w) {
    	((DS_2)ds).setw(w);//going to ready or overdrawn in case of withdraw by calling balance
        if(((DS_2)ds).getbal()>=0)
        	{
        	mda.Withdraw();
        	mda.AboveMinBalance();
        	}
        else
        	{
        	mda.NoFunds();	//printing in case of low balance to withdraw.
        	}
    }
    public void BALANCE() {
        mda.Balance();	//shown balance bby calling this function.
    }
    public void LOGIN(int y) {
    	 if(((DS_2)ds).getid()==y)	//logging with the id
         	mda.Login();
         else
         	mda.IncorrectLogin();//calling in case of of wrong id
    }
    public void LOGOUT() {
        mda.Logout();		//calling logout
    }
    public void suspend() {
        mda.Suspend();		//going to suspended state
    }
    public void activate() {
        mda.Activate();	//going to ready state suspended
    }
    public void close() {
        mda.Close();	// exiting on close
    }
}