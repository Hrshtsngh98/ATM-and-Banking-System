public class A7_2 extends A7 {
	Data ds;
    public A7_2(Data ds) {
    	this.ds=ds;
    }
    public void DisplayBalance() {
    	System.out.println("Balance = "+((DS_2)ds).getbal());
    }
}