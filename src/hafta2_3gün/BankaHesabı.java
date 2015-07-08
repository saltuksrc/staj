package hafta2_3gün;

public class BankaHesabı {
	private double bakiye;
	private String hesapNumarası;

	public BankaHesabı(String hesapNumarası) {
		this.hesapNumarası = hesapNumarası;
	}

	public void paraYatır(double miktar) {
		bakiye = bakiye + miktar;
	}

	public void al(double miktar) {
		if (miktar <= bakiye) {
			bakiye = bakiye - miktar;

		} else {
			System.err.println("Yeteri bakiyeniz bulunmamaktatır...");
		}
	}

	public double getBakiye() {
		return bakiye;
	}

	public String getHesapNumarası() {
		return hesapNumarası;
	}

	public void aktar(double miktar, BankaHesabı digerHesap) {
		if (!this.hesapNumarası.equalsIgnoreCase(digerHesap.hesapNumarası)) {
			this.al(miktar);
			digerHesap.paraYatır(miktar);
		} else {
			System.err.println("Kendi hesabınıza para aktaramazsınız");
		}
	}
}
