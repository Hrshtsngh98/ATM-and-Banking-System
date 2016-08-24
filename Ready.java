public class Ready extends EFSM_State {
    int Id =3;
    public Ready(){}
    public Ready(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	mda = mda_EFSM;
    	op=new Operations(ds, acc);
	}
	public void Deposit() {
       op.MakeDeposit();
    }
    public void Balance() {
    	op.DisplayBalance();   
    }
    public void Suspend() {
    	mda.ChangeState(7);
    }
    public void Lock() {
    	mda.ChangeState(5);
    }
    public void IncorrectLock() {
        op.IncorrectLockMsg();
    }
    public void Withdraw() {
        op.MakeWithdraw();
        mda.ChangeState(6);
    }
    public void Logout() {
    	mda.ChangeState(1);
    }
    public void NoFunds() {
        op.NoFundsMsg();
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
	public void Activate() {
	}
	@Override
	public void Close() {
	}
}