public class Account_Factory_2 
extends Abstract_Factory {
    public Account_Factory_2() {
    }
 // The concrete factory class are used to define 
    //the correct abject for the parent class
    public Data SetDataObject(){
    	return new DS_2();
    }
    public A1 A1(Data ds) {
    	return new A1_2(ds);
    }
    public A2 A2() {
    	return new A2_1();
    }
    public A3 A3() {
    	return new A3_1();
    }
    public A4 A4() {
    	return new A4_1();
    }
    public A5 A5() {
    	return new A5_2();
    }
    public A6 A6(Data ds) {
    	return new A6_2(ds);
    }
    public A7 A7(Data ds) {
    	return new A7_2(ds);
    }
    public A8 A8() {
    	return new A8_1();
    }
    public A9 A9(Data ds) {
    	return new A9_2(ds);
    }
    public A10 A10(Data ds) {
    	return new A10_1(ds);
    }
    public A11 A11() {
    	return new A11_1();
    }
    public A12 A12() {
    	return new A12_1();
    }
    public A13 A13() {
    	return new A13_2();
    }
}