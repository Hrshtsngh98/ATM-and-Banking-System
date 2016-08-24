public class A6_2 extends A6 {
	Data ds;
    public A6_2(Data ds) {
    	this.ds=ds;
    }
    public void MakeDeposit() {
        ((DS_2)ds).setbal(((DS_2)ds).getd());
    }
}