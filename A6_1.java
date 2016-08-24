public class A6_1 extends A6 {
	Data ds;
    public A6_1(Data ds) {
    this.ds=ds;
    }
    public void MakeDeposit() {
    	((DS_1)ds).setbal(((DS_1)ds).getd());
    }
}