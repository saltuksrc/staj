import java.util.Scanner;

public class Soru4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ekrandan okunan 3 say�sal verinin en b�y���n� bularak ekrana yazd�ran
		// programlama dilini yaz�n�z.

		
		int[] sayi = new int[3];
		System.out.println("3 adet say� giriniz; ");
		Scanner scan = new Scanner(System.in);
		int max=0;
		for (int i = 0; i < sayi.length; i++) {

	
			System.out.println(i+1 + ". say�y� giriniz; ");

			sayi[i] = scan.nextInt();
			System.out.println(i+1 + ". say� = " + sayi[i]);
		}
		max= sayi[0];
		int index=0;	
		
		for(int i=0; i < sayi.length; i++){
			if(sayi[i]>max){
				index = i;
				max = sayi[i];
				
				System.out.println("\nGirilen en b�y�k say�; "+max);
				
				
			}
			
			
		}

	}

}
