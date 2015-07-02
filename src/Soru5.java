import java.util.Scanner;


public class Soru5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ekrandan okunan 3 karakter verinin (String) en büyüðünü bularak ekrana yazdýran bilgisayar programýný
		//Java programlama dilinde yazýnýz. 

		String[] veriler= new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("3 adet veri giriniz");
		
		for(int i = 0; i<veriler.length; i++){
			System.out.print(i+1+".veri= ");
			veriler[i] = scan.next();
			
					
		}
		
		
		int index = 0;
		for (int j = 1; j < veriler.length; j++) {
			if (veriler[index].compareTo(veriler[j]) < 0) {
				index = j;
			}
		}
		System.out.println("index=" + index + " yazi=" + veriler[index]);
	
		
			
		
		
		
		
	}

}
