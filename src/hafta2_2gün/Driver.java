package hafta2_2g�n;

public class Driver {

	public static void main(String[] args) {

		Hayvan k = new Kopek();
		Ordek o = new Ordek(19);
		Ordek o2 = new Ordek(25);

		System.out.println(k.sesC�kar() + "\n" + k.y�r�() + " Ya��m= "+ k.yasSoyle());
		System.out.println(o.sesC�kar() + "\n" + o.y�r�() + "\n" + o.uc()+ " Ya��m= " + o.yasSoyle());
		System.out.println(o2.sesC�kar() + "\n" + o2.y�r�() + "\n" + o.uc()+ " Ya��m= " + o2.yasSoyle());

		o2.setYas(77);

		System.out.println(k.sesC�kar() + "\n" + k.y�r�() + " Ya��m= "+ k.yasSoyle());
		System.out.println(o.sesC�kar() + "\n" + o.y�r�() + "\n" + o.uc()+ " Ya��m= " + o.yasSoyle());
		System.out.println(o2.sesC�kar() + "\n" + o2.y�r�() + "\n" + o.uc()+ " Ya��m= " + o2.yasSoyle());

	}

}
