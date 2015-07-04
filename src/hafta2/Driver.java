package hafta2;

public class Driver {

	public static void main(String[] args) {
		Cisim d = new Dikdortgen(20.0, 30.0);

		//d instance deniliyor
		
		System.out.println("Alan=" + d.alan() + " Cevre=" + d.cevre());

		d = new Kare(20.0);

		System.out.println("Alan=" + d.alan() + " Cevre=" + d.cevre());

		d = new MarsKare(20.0);

		System.out.println("Alan=" + d.alan() + " Cevre=" + d.cevre());
		
		Kup k = new Kup(20, 30, 10);
		System.out.println("Alan=" + k.alan() + " Hacim=" +k.hacim());
		

	}

}
