import java.util.Scanner;


public class Soru3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Klavyeden bir boy uzunluðu isteyiniz. 175’e eþit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’, 
		//175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajýný yazdýracak þekilde programý yazýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen boy uzunluðunuzu giriniz =");
		int uzunluk = scan.nextInt();
		int boy=175;
		
			if(boy<=uzunluk){

				System.out.println("Uzun Boylusunuz");
				
			}
			else{
				
				System.out.println("Kýsa Boylusunuz");	
				
			}
				
			
			
			
			
		
	}
}



