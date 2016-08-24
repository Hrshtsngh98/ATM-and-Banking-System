
public class DS_2 extends Data {
    public DS_2() {
    }
    int pin;
    int temp_p;
    int id;
    int temp_y;
    int bal;
    int temp_a;
    int d;
    int w;
    public void setdata(int p, int y, int a) {
    	temp_p = p;			//storing the received data to temporary place
        temp_y = y;
        temp_a = a;
    }
    public int getpin() {
    	return pin;		//returning pin to calling function
    }
    public int getid() {
        return id;		//returning id to calling function
    }
    public int getbal() {
        return bal;		//returning bal to calling function
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
    public void setbal(int b) {
    	bal=bal+b;		//adding the deposit balance
    }
    public void setd(int d) {
    	this.d=d;
    }
    public void setw(int w) {
    	this.w=w;   
    }
    public int getd() {
        return d;
    }
    public int getw() {
        return w;
    }

}