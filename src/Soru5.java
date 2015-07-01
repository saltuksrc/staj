import java.util.Scanner;

public class Soru5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ekrandan okunan 3 karakter verinin (String) en b�y���n� bularak
		// ekrana yazd�ran bilgisayar program�n�
		// Java programlama dilinde yaz�n�z.

		String[] yazi = new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("3 adet veri giriniz");

		for (int i = 0; i < yazi.length; i++) {

			System.out.print(i + 1 + ".veri= ");
			yazi[i] = scan.next();

		}
		int index = 0;
		for (int j = 1; j < yazi.length; j++) {
			if (yazi[index].compareTo(yazi[j]) < 0) {
				index = j;
			}
		}
		System.out.println("index=" + index + " yazi=" + yazi[index]);

	}

}
