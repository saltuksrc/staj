package hafta2_2gün;

public class Driver {

	public static void main(String[] args) {

		Hayvan k = new Kopek();
		Ordek o = new Ordek();

		System.out.println(k.sescýkar() + "\n" + k.yürü());
		System.out.println(o.sescýkar() + "\n" + o.yürü()+"\n" + o.uc());

	}

}
