package methodsex;

public class Z {
	String name;
	double mileage;
	double highSpeed;
	public Z(String name) {
	   this.name=name;
	}
	public Z(String name,double mileage) {
        this(name);
		this.mileage=mileage;
	}
	public Z(String name,double mileage,double highSpeed ) {
		this(name,mileage);
		this.highSpeed=highSpeed;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.mileage);
		System.out.println(this.highSpeed);
	}
}
		
		