package hafta2_2g�n;

public class Ordek implements Hayvan {
	private int yas = 1;

	public Ordek(int yas) {
		this.yas = yas;

	}

	public String uc() {
		return "U�uyorum";

	}

	public String sesC�kar() {
		// TODO Auto-generated method stub
		return ("vak vak�...!");
	}

	public String y�r�() {
		// TODO Auto-generated method stub
		return "Y�zd�m...";
	}

	public int yasSoyle() {
		// TODO Auto-generated method stub
		return this.yas;
	}

	public void setYas(int yas) {
		this.yas = yas;

	}

}
