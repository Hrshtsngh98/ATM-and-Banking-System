public class Overdrawn extends EFSM_State {
    public Overdrawn() {
    }
    public Overdrawn(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	mda = mda_EFSM;
    	op=new Operations(ds, acc);
	}
	int Id =4;
    public void Withdraw() {
        op.NoFundsMsg();
    }
    public void Balance() {
        op.DisplayBalance();
    }
    public void Lock() {
        mda.ChangeState(5);
    }
    public void IncorrectLock() {
        op.IncorrectLockMsg();
    }
    public void Deposit() {
        op.MakeDeposit();
        mda.ChangeState(6);
    }
    public void NoFunds() {
		op.NoFundsMsg();
	}
    public void Logout() {
    	mda.ChangeState(1);
    }
	@Override
	public void Open() {
	}
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
	public void BelowMinBalance() {
	}
	@Override
	public void AboveMinBalance() {
	}
	@Override
	public void WithdrawBelowMinBalance() {
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