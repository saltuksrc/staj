package hafta2_2g�n;

public class Driver {

	public static void main(String[] args) {

		Kopek k = new Kopek();
		Ordek o = new Ordek(19);
		Ordek o2 = new Ordek(25);

		System.out.println(k.sesC�kar() + "\n" + k.y�r�() + " Ya��m= "+ k.yasSoyle());
		System.out.println(o.sesC�kar() + "\n" + o.y�r�() + "\n" + o.uc()+ " Ya��m= " + o.yasSoyle());
		System.out.println(o2.sesC�kar() + "\n" + o2.y�r�() + "\n" + o.uc()+ " Ya��m= " + o2.yasSoyle());

		o2.setYas(77);
		k.setYas(66);
		Point p = new Point(22);
		
		
		System.out.println(k.sesC�kar() + "\n" + k.y�r�() + " Ya��m= "+ k.yasSoyle());
		System.out.println(o.sesC�kar() + "\n" + o.y�r�() + "\n" + o.uc()+ " Ya��m= " + o.yasSoyle());
		System.out.println(o2.sesC�kar() + "\n" + o2.y�r�() + "\n" + o.uc()+ " Ya��m= " + o2.yasSoyle());

		System.out.println(p.getX());
		p.setX(5);
		System.out.println(p.getX());
		
	}
	 

}

