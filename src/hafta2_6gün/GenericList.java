package hafta2_6gün;

import java.awt.List;
import java.util.ArrayList;

public class GenericList {

	public static void main(String[] args) {

		ArrayList<String> markalar = new ArrayList<String>();

		markalar.add("Harley Davitson");
		markalar.add("Kawasaki");
		markalar.add("Honda");
		markalar.add("Yamaha");

		int markaSayisi = markalar.size();
		String elemanlar = "Dizinin Elemanlarý;\n";

		for (int i = 0; i < markaSayisi; i++) {

			elemanlar = markalar.get(i);
			System.out.println(elemanlar);

			

		}

	}
}
