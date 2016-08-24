public class A1_2 extends A1 {
	Data ds;
    public A1_2(Data ds) {
    	this.ds=ds;
    }
    public void StoreData() {
    	DS_2 temp=(DS_2) ds;
       temp.setbal();
       temp.setpin();
       temp.setid();
    }
}