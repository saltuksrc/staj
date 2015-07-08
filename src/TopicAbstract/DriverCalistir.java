package TopicAbstract;

public class DriverCalistir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Kus bulbul = new Kus();
		bulbul.cins = "Bülbül";
		bulbul.boy = 22;
		bulbul.agirlik = 0.3;
		bulbul.yas = 2;
		System.out.println("BÜLBÜL BUNLARI YAPIYOR");
		bulbul.yasa();
		bulbul.uc();
		bulbul.NefesAl();
		bulbul.HereketEt();
		bulbul.ol();

		System.out.println(bulbul.agirlik + "\n" + bulbul.cins);

		System.out.println("\n\nHAMSÝ BUNLARI YAPIYOR");

		Balik hamsi = new Balik();
		hamsi.cins = "Hamsi";
		hamsi.agirlik = 0.0800;
		hamsi.yas = 1;
		hamsi.boy = 7;

		hamsi.yasa();
		hamsi.NefesAl();
		hamsi.HereketEt();
		hamsi.ol();

		System.out.println(hamsi.yas + "\n" + hamsi.boy);

	}

}
