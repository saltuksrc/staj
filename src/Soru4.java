import java.util.Scanner;

public class Soru4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ekrandan okunan 3 sayýsal verinin en büyüðünü bularak ekrana yazdýran
		// programlama dilini yazýnýz.

		
		int[] sayi = new int[3];
		System.out.println("3 adet sayý giriniz; ");
		Scanner scan = new Scanner(System.in);
		int max=0;
		for (int i = 0; i < sayi.length; i++) {

	
			System.out.println(i+1 + ". sayýyý giriniz; ");

			sayi[i] = scan.nextInt();
			System.out.println(i+1 + ". sayý = " + sayi[i]);
		}
		max= sayi[0];
		int index=0;	
		
		for(int i=0; i < sayi.length; i++){
			if(sayi[i]>max){
				index = i;
				max = sayi[i];
				
				System.out.println("\nGirilen en büyük sayý; "+max);
				
				
			}
			
			
		}

	}

}
