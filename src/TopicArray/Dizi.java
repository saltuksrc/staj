package TopicArray;

import java.util.Scanner;

public class Dizi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayı giriniz");
		int sayi = scan.nextInt();
		int sıradakiBosIndex = 0;

		int[] ciftSayilar = new int[sayi / 2];
		for (int i = 0; i < sayi; i++) {
			if (i % 2 == 0) {
				ciftSayilar[sıradakiBosIndex] = i;
				sıradakiBosIndex++;
			}

		}

		for (int i1 = 0; i1 < sıradakiBosIndex; i1++) {
		
			System.out.println(ciftSayilar[i1]);
		}
	}

}
