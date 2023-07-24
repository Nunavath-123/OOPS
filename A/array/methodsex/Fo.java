package methodsex;

public class Fo {
	String name;
	double tp;
	double mileage;
	public Fo(String name, double tp, double mileage) {
		super();
		this.name = name;
		this.tp = tp;
		this.mileage = mileage;
	}
	 public boolean equlas (Object obj) {
		Fo fo=((Fo)obj);
		return this.name==fo.name&&
		       this.tp==fo.tp&&
		       this.mileage==fo.mileage;
	 }
}