package hafta2;

//public gorunebilirlik/eriselebilik demektir.
//public: her yerde 
//private ancak bu class icinde
//protected: cocuklarda
//default (tanimlanmamis): package icinde.
public class Dikdortgen implements Cisim {

	//en ve boyu member deniliyor.
	private double eni;
	private double boyu;

	//bu constructor. Bir nevi kaliptir. Farkli ozellikleri iceren contructor olmasa (tanimlamasan) deafult constructorun paramteresi yoktur.
	//tanimladigin zaman default contstructor yoktur. Eger gerekiyorsa, tanimlaman lazim.
	public Dikdortgen(double eni, double boyu){
		this.eni = eni;
		this.boyu = boyu;
	}
	
	
	public double alan() {
		return eni * boyu;
	}


	public double cevre() {
		return 2 * (eni + boyu);
	}

	//erismek icin
	public double getEni() {
		return eni;
	}

	//degistirmek icin.
	public void setEni(double eni) {
		this.eni = eni;
	}
	
	

	public double getBoyu() {
		return boyu;
	}

	public void setBoyu(double boyu) {
		this.boyu = boyu;
	}
	
	

}
