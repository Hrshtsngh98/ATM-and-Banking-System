public class A9_1 extends A9 {
	Data ds;
    public A9_1(Data ds) {
    	this.ds=ds;
    }
    public void MakeWithdraw() {
    	((DS_1)ds).setbal(-((DS_1)ds).getw());
    }
}