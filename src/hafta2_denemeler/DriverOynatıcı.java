package hafta2_denemeler;

public class DriverOynatıcı {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Canli canli = new Canli();
		canli.yas = 10;
		canli.yasa();
		canli.ol();

		Bitki bitki = new Bitki();
		bitki.yas = 8;
		bitki.renk="Turuncu";
		bitki.yasa();
		bitki.yaprakDok();
		bitki.ol();
		

		Hayvan hayvan = new Hayvan();
		hayvan.yas = 1;
		hayvan.cins="Tavşan";
		hayvan.yasa();
		hayvan.kos();
		hayvan.ol();

	}

}
