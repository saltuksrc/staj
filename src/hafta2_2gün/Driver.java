package hafta2_2gün;

public class Driver {

	public static void main(String[] args) {

		Kopek k = new Kopek();
		Ordek o = new Ordek(19);
		Ordek o2 = new Ordek(25);

		System.out.println(k.sesCýkar() + "\n" + k.yürü() + " Yaþým= "+ k.yasSoyle());
		System.out.println(o.sesCýkar() + "\n" + o.yürü() + "\n" + o.uc()+ " Yaþým= " + o.yasSoyle());
		System.out.println(o2.sesCýkar() + "\n" + o2.yürü() + "\n" + o.uc()+ " Yaþým= " + o2.yasSoyle());

		o2.setYas(77);
		k.setYas(66);
		Point p = new Point(22);
		
		
		System.out.println(k.sesCýkar() + "\n" + k.yürü() + " Yaþým= "+ k.yasSoyle());
		System.out.println(o.sesCýkar() + "\n" + o.yürü() + "\n" + o.uc()+ " Yaþým= " + o.yasSoyle());
		System.out.println(o2.sesCýkar() + "\n" + o2.yürü() + "\n" + o.uc()+ " Yaþým= " + o2.yasSoyle());

		System.out.println(p.getX());
		p.setX(5);
		System.out.println(p.getX());
		
	}
	 

}

