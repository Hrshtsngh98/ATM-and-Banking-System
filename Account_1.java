public class Account_1 {
	Data ds;		//declaring data structure object
	MDA_EFSM mda;		//declaring MDA_EFSM object
	Abstract_Factory af;	//Declaring abstract factory object
	public Account_1() 
	{
    	af=new Account_Factory_1();		//initializing the object
    	ds = af.SetDataObject();		//initializing the object
    	mda=new MDA_EFSM(ds,"Account1");//initializing the object and calling parameterized contructor and passing data structure object and Account name
    }
    public void open(String p, String y, float a) {
       ((DS_1)ds).setdata(p,y,a);		//type casting and call function to store data
       mda.Open();
    }
    public void pin(String x) {
        try{
    	if(x.equals(((DS_1)ds).getpin())){	//checking the pin in case of logging in.
        	if(((DS_1)ds).getbal()<500)		//checking for going to ready or overdrawn state
        		mda.CorrectPinBelowMin();	//going to overdrawn state
        	else
        		mda.CorrectPinAboveMin();	//going to ready state
        }
        else mda.IncorectPin(3);		//calling in case of of wrong pin
        }
        catch(Exception e){System.err.println("Operation not supported!");}//printing wrong operation called
    }
    public void deposit(float d) {
        ((DS_1)ds).setd(d);
        mda.Deposit();				//calling deposit 
        if(((DS_1)ds).getbal()>=500)		//going to ready or overdrawn in case of deposit by calling balance
        	mda.AboveMinBalance();		
        else
        	mda.BelowMinBalance();
    }
    public void withdraw(float w) {
    	((DS_1)ds).setw(w);
        if(((DS_1)ds).getbal()>=500)
        	{
        	mda.Withdraw();
        	if(((DS_1)ds).getbal()>=500)//going to ready or overdrawn in case of withdraw by calling balance
        		mda.AboveMinBalance();
        	else
        		mda.WithdrawBelowMinBalance();
        	}
        else
        	{
        	mda.NoFunds();//printing in case of low balance to withdraw.
        	}
    }
    public void balance() {
        mda.Balance();		//shown balance by calling this function.
    }
    public void login(String i) {
       try {
		 if(((DS_1)ds).getid().equals(i))	//checking for the correct Id
        	mda.Login();
        else
        	mda.IncorrectLogin();
       } catch (Exception e) {
   		System.err.println("Operation not supported!");
   	}}
    public void logout() {
        mda.Logout();		//Logout from the account 
    }
    public void lock(String x) {//locking by checking pin
    	try{if(((DS_1)ds).getpin().equals(x))	
    		mda.Lock();			// locking the account
    	else
    		mda.IncorrectLock();	//If pin is incorrect then show message from here
    	}catch(Exception e){}
    }
    public void unlock(String x) {
       if(((DS_1)ds).getpin().equals(x))	//unlocking by checking pin
       {
    	   mda.Unlock();
    	   if(((DS_1)ds).getbal()>=500)
    		   mda.AboveMinBalance();	//changing state in case of above min balance
    	   else
    		   mda.BelowMinBalance();	//changing state in case of below min balance
       }
       else
    	   mda.IncorrectUnlock();		//showing message in case of wrong pin
    }
}