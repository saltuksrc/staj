import java.util.Scanner;


public class Soru1 {

	public static final double PI = 3.14;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Yar��ap De�erini Klavyeden okuyarak bir dairenin alan�n� ve �evresini hesaplayan program� yaz�n�z. 
		
		Scanner scan= new Scanner(System.in);
		int r;
		System.out.print("Hesaplamak istedi�iniz dairenin �ap�n� giriniz; ");
		
		Soru1 c1 = new Soru1();
		Soru1 c2 = new Soru1();
		
		r  = scan.nextInt();
		
		
		
		System.out.println(" Dairenin �evresi= "+ c1.cevre(r) + "\n Dairenin Alan�= "+ c2.alan(r) + "\n Pi Say�s� 3 Al�nm��t�r!");
	
		
	}
	
		public double cevre(int r){
		
				
			return 2*PI*r;
		
	}
	
		public double alan(int r){
			
			
			return PI*(r*r);
}
}
