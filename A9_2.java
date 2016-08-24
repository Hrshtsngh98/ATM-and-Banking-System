public class A9_2 extends A9 {
	Data ds;
    public A9_2(Data ds) {
    	this.ds=ds;
    }
    public void MakeWithdraw() {
    	((DS_2)ds).setbal(-((DS_2)ds).getw());
    }
}