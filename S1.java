public class S1 extends EFSM_State 
{
	public S1() {
    }
    public S1(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	mda = mda_EFSM;
    	op=new Operations(ds, acc);
	}
	int Id = 6;
    public void AboveMinBalance() {
    	mda.ChangeState(3);	
    }
    public void BelowMinBalance() {
    	mda.ChangeState(4);
    }
    public void WithdrawBelowMinBalance() {
        op.Penalty();
        mda.ChangeState(4);
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
	public void IncorectPin(int max) {
	}
	@Override
	public void CorrectPinBelowMin() {
	}
	@Override
	public void CorrectPinAboveMin() {
	}
	@Override
	public void Deposit() {
	}
	@Override
	public void Logout() {
	}
	@Override
	public void Balance() {
	}
	@Override
	public void Withdraw() {
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