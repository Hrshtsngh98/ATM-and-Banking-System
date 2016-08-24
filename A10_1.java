public class A10_1 extends A10 {
	Data ds;
    public A10_1(Data ds) {
    	this.ds=ds;
    }
    public void Penalty() {
        ((DS_1)ds).setbal(-20);
    }
}