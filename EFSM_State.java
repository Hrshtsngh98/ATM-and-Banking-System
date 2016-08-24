public abstract class EFSM_State 
{
	Operations op;
	MDA_EFSM mda;
	int Id;
    public EFSM_State(Data ds, String acc, MDA_EFSM mda_EFSM) {
    	op=new Operations(ds, acc);
    }
  //abstract function in the class defined in the abstract class
    public EFSM_State(){}
 	public abstract void Open() throws Exception;
    public abstract void Login() throws Exception;
    public abstract void IncorrectLogin() throws Exception;
    public abstract void IncorectPin(int max) throws Exception;
 	public abstract void CorrectPinBelowMin() throws Exception;
    public abstract void CorrectPinAboveMin() throws Exception;
    public abstract void Deposit() throws Exception;
    public abstract void BelowMinBalance() throws Exception;
    public abstract void AboveMinBalance() throws Exception;
    public abstract void Logout() throws Exception;
    public abstract void Balance() throws Exception;
    public abstract void Withdraw() throws Exception;
    public abstract void WithdrawBelowMinBalance() throws Exception;
    public abstract void NoFunds() throws Exception;
    public abstract void Lock() throws Exception;
    public abstract void IncorrectLock() throws Exception;
    public abstract void Unlock() throws Exception;
    public abstract void IncorrectUnlock() throws Exception;
    public abstract void Suspend() throws Exception;
    public abstract void Activate() throws Exception;
    public abstract void Close() throws Exception;
}