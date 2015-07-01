import java.util.Scanner;


public class Soru1 {

	public static final double PI = 3.14;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Yarýçap Deðerini Klavyeden okuyarak bir dairenin alanýný ve çevresini hesaplayan programý yazýnýz. 
		
		Scanner scan= new Scanner(System.in);
		int r;
		System.out.print("Hesaplamak istediðiniz dairenin çapýný giriniz; ");
		
		Soru1 c1 = new Soru1();
		Soru1 c2 = new Soru1();
		
		r  = scan.nextInt();
		
		
		
		System.out.println(" Dairenin Çevresi= "+ c1.cevre(r) + "\n Dairenin Alaný= "+ c2.alan(r) + "\n Pi Sayýsý 3 Alýnmýþtýr!");
	
		
	}
	
		public double cevre(int r){
		
				
			return 2*PI*r;
		
	}
	
		public double alan(int r){
			
			
			return PI*(r*r);
}
}
