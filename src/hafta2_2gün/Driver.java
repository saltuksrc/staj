package hafta2_2gün;

public class Driver {

	public static void main(String[] args) {

		Hayvan k = new Kopek();
		Ordek o = new Ordek(19);
		Ordek o2 = new Ordek(25);

		System.out.println(k.sesCýkar() + "\n" + k.yürü() + " Yaþým= "+ k.yasSoyle());
		System.out.println(o.sesCýkar() + "\n" + o.yürü() + "\n" + o.uc()+ " Yaþým= " + o.yasSoyle());
		System.out.println(o2.sesCýkar() + "\n" + o2.yürü() + "\n" + o.uc()+ " Yaþým= " + o2.yasSoyle());

		o2.setYas(77);

		System.out.println(k.sesCýkar() + "\n" + k.yürü() + " Yaþým= "+ k.yasSoyle());
		System.out.println(o.sesCýkar() + "\n" + o.yürü() + "\n" + o.uc()+ " Yaþým= " + o.yasSoyle());
		System.out.println(o2.sesCýkar() + "\n" + o2.yürü() + "\n" + o.uc()+ " Yaþým= " + o2.yasSoyle());

	}

}
