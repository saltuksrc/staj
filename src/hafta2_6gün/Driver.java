package hafta2_6gün;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		Bilgisayar pc1 = new Bilgisayar();

		pc1.islemci = "İntel";
		pc1.marka = "Casper";
		pc1.ram = 4;

		Bilgisayar pc2 = new Bilgisayar();

		pc2.islemci = "İntel";
		pc2.marka = "DELL";
		pc2.ram = 8;

		List<Bilgisayar> bilgisayarListesi = new ArrayList<>();
		bilgisayarListesi.add(pc1);
		bilgisayarListesi.add(pc2);

		int alınanRam = bilgisayarListesi.get(1).ram;

		System.out.println("2.Bilgisayarın ram miktarı= "+alınanRam);

	}
}
