public class A7_1 extends A7 {
	Data ds;
    public A7_1(Data ds) {
    	this.ds=ds;
    }
    public void DisplayBalance() {
       System.out.println("Balance = "+((DS_1)ds).getbal());
    }
}