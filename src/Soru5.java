import java.util.Scanner;


public class Soru5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ekrandan okunan 3 karakter verinin (String) en büyüðünü bularak ekrana yazdýran bilgisayar programýný
		//Java programlama dilinde yazýnýz. 

		String[] yazi= new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("3 adet veri giriniz");
		
		for(int i = 0; i<yazi.length ; i++){
			
			System.out.print(i+1+".veri= ");
			yazi[i] = scan.next();
			
		}
		for(int j=0 ; j<yazi.length ; j++){
			
		}
		
		
		
		
		
	}

}
