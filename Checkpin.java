public class Checkpin extends EFSM_State {
    public Checkpin() {
    }
    public Checkpin(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	mda = mda_EFSM;
    	op=new Operations(ds, acc);
	}
	int Id = 2;
    public void IncorectPin(int max) {
    	if(mda.getatt()<max){
    		mda.setattempt(mda.getatt()+1);
    		op.IncorrectPinMsg();
    	}
    	else
    	{
    		op.IncorrectPinMsg();
    		op.TooManyAttemptsMsg();
    		mda.ChangeState(1);
    	}
    }
    public void CorrectPinBelowMin() {
    	op.DisplayMenu();
    	mda.ChangeState(4);
    }
    public void CorrectPinAboveMin() {
        op.DisplayMenu();
        mda.ChangeState(3);
    }
    public void Logout() {
    	mda.ChangeState(1);    
    }
    @Override
	public void Open() {
	}
	@Override
	public void Login() {
	}
	@Override
	public void IncorrectLogin() {
	}
	@Override
	public void Deposit() {
	}
	@Override
	public void BelowMinBalance() {
	}
	@Override
	public void AboveMinBalance() {
	}
	@Override
	public void Balance() {
	}
	@Override
	public void Withdraw() {
	}
	@Override
	public void WithdrawBelowMinBalance() {
	}
	@Override
	public void NoFunds() {
	}
	@Override
	public void Lock() {
	}
	@Override
	public void IncorrectLock() {
	}
	@Override
	public void Unlock() {
	}
	@Override
	public void IncorrectUnlock() {
	}
	@Override
	public void Suspend() {
	}
	@Override
	public void Activate() {
	}
	@Override
	public void Close() {
	}
}