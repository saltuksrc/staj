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

		// Final tan�mlanm�� bir property ye farkl� bir de�er atanamaz, ilk
		// verilen de�er her zaman onun sabir de�eridir.

		// icecek.maddeCinsi="Gaz";

	}

}
