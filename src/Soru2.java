import java.util.Scanner;


public class Soru2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
	 	Klavyeden okunacak bir e-mail adresindeki kullanýcý adýný ve sunucu adýný ekrana yazdýran bilgisayar programýný Java dilinde yazýnýz. 
		
		e-mail adresi örneði: turkaslan@gmail.com 
		Ekrana: 
		kullaniciadi: turkaslan 
		sunucu: gmail yazacak. 
		*/
		
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Lütfen e-mail'inizi giriniz; ");
		String harf= sc.next();
		
		String[] kullanici = harf.split("@");
		String isim = kullanici[0];
		String host = kullanici[1];
		
		String[] baglantilar = host.split(".");
		String host1 = baglantilar[0];
		
		System.out.println("Kullanýcý adýnýz; "+ isim + "\n Baðlandýðýnýz sunucu; " + host1);
		
		
		
		
	}

}
