import java.util.Scanner;

public class Soru6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Soru Bir ��renciye bir soru sorulsun ve ��renciden cevap al�ns�n.
		// ��rencinin verdi�i cevap do�ru de�ilse, bir defa daha sorunun
		// soruldu�u durumunu Java program�nda yaz�n�z.
		
		String baskent = "ankara";
		boolean cevap = false;
		
		do {
			System.out.println("T�rkiyenin Ba�kenti Neresidir?");
			Scanner scan = new Scanner(System.in);
			String al�nan = scan.next();
			

			if (al�nan == baskent) {
				cevap = true;
				System.out.println("Do�ru bildin, T�rkiyenin Ba�kenti Ankara'd�r...");

			} else {

				System.out.println("Yanl�� girdiniz tekrar deneyiniz!");
			}
		} while (cevap != true);

	} 

}
