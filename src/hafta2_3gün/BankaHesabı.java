package hafta2_3g�n;

public class BankaHesab� {
	private double bakiye;
	private String hesapNumaras�;

	public BankaHesab�(String hesapNumaras�) {
		this.hesapNumaras� = hesapNumaras�;
	}

	public void paraYat�r(double miktar) {
		bakiye = bakiye + miktar;
	}

	public void al(double miktar) {
		if (miktar <= bakiye) {
			bakiye = bakiye - miktar;

		} else {
			System.err.println("Yeteri bakiyeniz bulunmamaktat�r...");
		}
	}

	public double getBakiye() {
		return bakiye;
	}

	public String getHesapNumaras�() {
		return hesapNumaras�;
	}

	public void aktar(double miktar, BankaHesab� digerHesap) {
		if (!this.hesapNumaras�.equalsIgnoreCase(digerHesap.hesapNumaras�)) {
			this.al(miktar);
			digerHesap.paraYat�r(miktar);
		} else {
			System.err.println("Kendi hesab�n�za para aktaramazs�n�z");
		}
	}
}
