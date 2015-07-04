package hafta2;

public class Kup extends Dikdortgen {
	private double derinlik;

	public Kup(double eni, double boyu, double derinlik) {
		super(eni, boyu);
		this.derinlik = derinlik;
	}

	
	public double hacim(){
		return this.alan()*derinlik;
	}

}
