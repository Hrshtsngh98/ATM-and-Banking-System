public class A1_1 extends A1 {
	Data ds;
    public A1_1(Data d) {
    	ds=d;
    }
    public void StoreData() {
    	DS_1 temp=(DS_1) ds;
        temp.setbal();
        temp.setpin();
        temp.setid();
    }
}