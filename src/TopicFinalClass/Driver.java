package TopicFinalClass;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Icecek icecek = new Icecek();
		icecek.birim = "Litre";
		icecek.fiyat = 2;

		// Final tanýmlanmýþ bir property ye farklý bir deðer atanamaz, ilk
		// verilen deðer her zaman onun sabir deðeridir.

		// icecek.maddeCinsi="Gaz";

	}

}
