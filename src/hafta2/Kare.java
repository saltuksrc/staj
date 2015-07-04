package hafta2;


class Kare implements Cisim {

	private double kenar;
	
	public Kare(double kenar){
		this.kenar  = kenar;
	}
	
	@Override
	public double alan() {
		return kenar*kenar;
	}

	@Override
	public double cevre() {
		return 4*kenar;
	}
	public static void main(String args []){
		Kare k = new Kare(10);
		System.out.println("Kare alan="+k.alan());
	}

}
