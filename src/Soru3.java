import java.util.Scanner;


public class Soru3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Klavyeden bir boy uzunlu�u isteyiniz. 175�e e�it veya k���kse ekrana �KISA BOYLUSUNUZ.�, 
		//175�den b�y�kse ekrana �UZUN BOYLUSUNUZ.� mesaj�n� yazd�racak �ekilde program� yaz�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen boy uzunlu�unuzu giriniz =");
		int uzunluk = scan.nextInt();
		int boy=175;
		
			if(boy<=uzunluk){

				System.out.println("Uzun Boylusunuz");
				
			}
			else{
				
				System.out.println("K�sa Boylusunuz");	
				
			}
				
			
			
			
			
		
	}
}



