public class MDA_EFSM {
	private EFSM_State LS[]; 
    private EFSM_State St;
    int attempts=1;
    public MDA_EFSM(Data ds,String acc) 
    {
    	LS=new EFSM_State[8];	//declaring the state variable
    	LS[0] = new OpenAccount(ds, acc, this);	//initialising OpenAccount state
    	LS[1] = new Idle(ds, acc, this);//initialising idle state
    	LS[2] = new Checkpin(ds, acc, this);//initialising the checkpin state
    	LS[3] = new Ready(ds, acc, this);
    	LS[4] = new Overdrawn(ds, acc, this);
    	LS[5] = new Locked(ds, acc, this);
    	LS[6] = new S1(ds, acc, this);
    	LS[7] = new Suspended(ds, acc, this);
    	St = LS[0];
    }
    public void Open() {
    	try {		//appropriate function to open account
			St.Open();
		} catch (Exception e) {
			System.out.println("Operation not supported!");	}
    }
    public void Login() {
     try {	//appropriate function to login account
		St.Login();
	} catch (Exception e) {
		System.out.println("Operation not supported!");}
    }
    public void IncorrectLogin() {
     try {		//appropriate function to show incorrect login account
		St.IncorrectLogin();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void IncorectPin(int max) {
     try {//appropriate function to check incorrect pin account
		St.IncorectPin(max);
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void CorrectPinBelowMin() {
     try {//appropriate function to check balance for next state account
		St.CorrectPinBelowMin();
	} catch (Exception e) {
		System.err.println("Operation not supported!"); }
    }
    public void CorrectPinAboveMin() {
     try {//appropriate function to check balance for next state account
		St.CorrectPinAboveMin();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Deposit() {
     try {//making deposit to the current account balance
		St.Deposit();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void BelowMinBalance() {
     try {	//function at S1 state for changing state to ready or overdrawn
		St.BelowMinBalance();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void AboveMinBalance() {
     try {//function at S1 state for changing state to ready or overdrawn
		St.AboveMinBalance();
     } catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Logout() {
     try {//logging out the account in this function
		St.Logout();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Balance() {
     try {
		St.Balance();//function to call balance of state
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Withdraw() {
     try {
		St.Withdraw();//function to call withdraw
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void WithdrawBelowMinBalance() {
     try {//function at S1 state for changing state to ready or overdrawn
		St.WithdrawBelowMinBalance();
	} catch (Exception e) {	
		System.err.println("Operation not supported!");	}
    }
    public void NoFunds() {
     try {// function to show no balance in account
		St.NoFunds();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Lock() {
     try {// function to lock the account
		St.Lock();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void IncorrectLock() {
     try {//function to check in correct lock
		St.IncorrectLock();
	} catch (Exception e) {	
		System.err.println("Operation not supported!");	}
    }
    public void Unlock() {
    	try {// function to unlock the account
			St.Unlock();
		} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void IncorrectUnlock() {
     try {//function to check in correct unlock
		St.IncorrectUnlock();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Suspend() {
     try {// function to suspend the account
		St.Suspend();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Activate() {
     try {// function to activate the account
		St.Activate();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void Close() {
     try {// function to close the account
		St.Close();
	} catch (Exception e) {
		System.err.println("Operation not supported!");	}
    }
    public void ChangeState(int id) {
    	//defined to change the current state pointer
    	System.out.println("State : "+LS[id].getClass().getName());
    	St = LS[id];     
    }
    public void setattempt(int x){
    	//setting number of attempts
    	attempts = x;
    }
    public int getatt(){
    	//retrieving the number of attempts
    	return attempts;
    }
}