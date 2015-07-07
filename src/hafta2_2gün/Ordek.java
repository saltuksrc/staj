package hafta2_2gün;

public class Ordek implements Hayvan {
	private int yas = 1;

	public Ordek(int yas) {
		this.yas = yas;

	}

	public String uc() {
		return "Uçuyorum";

	}

	public String sesCýkar() {
		// TODO Auto-generated method stub
		return ("vak vakð...!");
	}

	public String yürü() {
		// TODO Auto-generated method stub
		return "Yüzdüm...";
	}

	public int yasSoyle() {
		// TODO Auto-generated method stub
		return this.yas;
	}

	public void setYas(int yas) {
		this.yas = yas;

	}

}
