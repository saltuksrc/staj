import java.util.Scanner;

public class Soru6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Soru Bir öðrenciye bir soru sorulsun ve öðrenciden cevap alýnsýn.
		// Öðrencinin verdiði cevap doðru deðilse, bir defa daha sorunun
		// sorulduðu durumunu Java programýnda yazýnýz.
		
		String baskent = "ankara";
		boolean cevap = false;
		
		do {
			System.out.println("Türkiyenin Baþkenti Neresidir?");
			Scanner scan = new Scanner(System.in);
			String alýnan = scan.next();
			

			if (alýnan == baskent) {
				cevap = true;
				System.out.println("Doðru bildin, Türkiyenin Baþkenti Ankara'dýr...");

			} else {

				System.out.println("Yanlýþ girdiniz tekrar deneyiniz!");
			}
		} while (cevap != true);

	} 

}
