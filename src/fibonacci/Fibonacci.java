package fibonacci;

public class Fibonacci {

	private static int sayilar[] = new int[1000];

	static {
		sayilar[0] = 1;
		sayilar[1] = 1;
	}

	public static void main(String[] args) {

		System.out.println(fib(0));
		System.out.println(fib(10));
		System.out.println(fib(7));
	}

	public static int fib(int n) {

		
		if(n<2)return 1;
		if (sayilar[n - 1] == 0) {
			int býronceký = 1;
			int onceki = 1;

			for (int i = 2; i < n; i++) {
				sayilar[i] = býronceký + onceki;

				býronceký = onceki;
				onceki = sayilar[i];
				System.out.println("test= "+ sayilar[i]);
			}
		}

		sayilar[n] = sayilar[n - 1] + sayilar[n - 2];

			return sayilar[n];

	}

	public static void fib2(int n) {
		int býronceký = 1;
		int onceki = 1;
		int sayi = 0;

		System.out.print(býronceký + " - " + onceki + " - ");

		for (int i = 0; i < n; i++) {
			sayi = býronceký + onceki;

			býronceký = onceki;
			onceki = sayi;

			System.out.print(sayi + " - ");
		}

	}

}