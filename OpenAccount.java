public class OpenAccount extends EFSM_State 
{
    public OpenAccount(){}
	public OpenAccount(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	mda = mda_EFSM;
		op=new Operations(ds, acc);
    }
    int Id = 0;
	@Override
	public void Open() {
    	op.StoreData();
    	mda.ChangeState(1);
	}
	@Override
	public void Login(){
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
	public void BelowMinBalance() {
	}
	@Override
	public void AboveMinBalance() {
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