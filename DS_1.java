
public class DS_1 extends Data {
    public DS_1() {
    }
    String pin;
    String temp_p;
    String id;
    String temp_y;
    float bal;
    float temp_a;
    float d;
    float w;

    public void setdata(String p,String y,float a) {
        temp_p=p;		//storing the received data to temporary place
        temp_y=y;
        temp_a=a;
    }
    public String getpin() {
        return pin;		//returning pin to calling function
    }
    public float getbal() {
    	return bal;   	//returning id to calling function
    }
    public String getid() {
        return id;		//returning bal to calling function
    }
    public void setpin() {
        pin=temp_p;		//storing temp pin to permanent pin
    }
    public void setbal() {
        bal=temp_a;		//storing temp_a to permanent amount
    }
    public void setid() {
    	id=temp_y;		//storing temp_id to permanent id
    }
    public void setbal(float b) {
     bal=bal+b;   	//adding the deposit balance
    }
    public void setd(float d) {
        this.d=d;
    }
    public void setw(float w) {
        this.w=w;
    }
    public float getd() {
        return d;
    }
    public float getw() {
        return w;
    }

}