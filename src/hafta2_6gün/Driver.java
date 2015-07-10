package hafta2_6gün;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Bilgisayar pc1 = new Bilgisayar();

		pc1.islemci = "Ýntel";
		pc1.marka = "Casper";
		pc1.ram = 4;

		Bilgisayar pc2 = new Bilgisayar();

		pc1.islemci = "Ýntel";
		pc1.marka = "DELL";
		pc1.ram = 8;

		List<Bilgisayar> bilgisayarListesi = new ArrayList<Bilgisayar>();
		bilgisayarListesi.add(pc1);
		bilgisayarListesi.add(pc2);

		int alýnanRam = bilgisayarListesi.get(1).ram;

		System.out.println("2.Bilgisayarýn ram miktarý= "+alýnanRam);

	}
}
