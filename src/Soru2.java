import java.util.Scanner;


public class Soru2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
	 	Klavyeden okunacak bir e-mail adresindeki kullan�c� ad�n� ve sunucu ad�n� ekrana yazd�ran bilgisayar program�n� Java dilinde yaz�n�z. 
		
		e-mail adresi �rne�i: turkaslan@gmail.com 
		Ekrana: 
		kullaniciadi: turkaslan 
		sunucu: gmail yazacak. 
		*/
		
	
		Scanner sc= new Scanner(System.in);
		System.out.print("L�tfen e-mail'inizi giriniz; ");
		String harf= sc.next();
		
		String[] kullanici = harf.split("@");
		String isim = kullanici[0];
		String host = kullanici[1];
		
		String[] baglantilar = host.split(".");
		String host1 = baglantilar[0];
		
		System.out.println("Kullan�c� ad�n�z; "+ isim + "\n Ba�land���n�z sunucu; " + host1);
		
		
		
		
	}

}
