public class Operations {
		A1 a1;
	    A2 a2;
	    A3 a3;
	    A4 a4;
	    A5 a5;
	    A6 a6;
	    A7 a7;
	    A8 a8;
	    A9 a9;
	    A10 a10;
	    A11 a11;
	    A12 a12;
	    A13 a13;
	public Operations(Data ds,String acc) {
    	if(acc.equals("Account1"))
    	{
    	Account_Factory_1 af=new Account_Factory_1();
    		a1=af.A1(ds);
    		a2=af.A2();
    		a3=af.A3();
    		a4=af.A4();
    		a5=af.A5();
    		a6=af.A6(ds);
    		a7=af.A7(ds);
    		a8=af.A8();
    		a9=af.A9(ds);
    		a10=af.A10(ds);
    		a11=af.A11();
    		a12=af.A12();
    		a13=af.A13();
    	}
    	if(acc.equals("Account2")){
    		Account_Factory_2 af=new Account_Factory_2();
    		a1=af.A1(ds);
        	a2=af.A2();
        	a3=af.A3();
        	a4=af.A4();
        	a5=af.A5();
        	a6=af.A6(ds);
        	a7=af.A7(ds);
        	a8=af.A8();
        	a9=af.A9(ds);
        	a10=af.A10(ds);
        	a11=af.A11();
        	a12=af.A12();
        	a13=af.A13();
    	}
    }
    public void StoreData() {
        a1.StoreData();
    }
    public void IncorrectIdMsg() {
        a2.IncorrectIdMsg();
    }
    public void IncorrectPinMsg() {
        a3.IncorrectPinMsg();
    }
    public void TooManyAttemptsMsg() {
        a4.TooManyAttemptsMsg();
    }
    public void DisplayMenu() {
        a5.DisplayMenu();
    }
    public void MakeDeposit() {
        a6.MakeDeposit();
    }
    public void DisplayBalance() {
        a7.DisplayBalance();
    }
    public void PromptForPin() {
        a8.PromptForPin();
    }
    public void MakeWithdraw() {
        a9.MakeWithdraw();
    }
    public void Penalty() {
        a10.Penalty();
    }
    public void IncorrectLockMsg() {
        a11.IncorrectLockMsg();
    }
    public void IncorrectUnlockMsg() {
        a12.IncorrectUnlockMsg();
    }
    public void NoFundsMsg() {
        a13.NoFundsMsg();
    }
}