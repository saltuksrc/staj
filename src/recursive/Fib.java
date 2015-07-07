package recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Account {
	public double balance;
	public String number;

	public Account(double balance, String number) {
		this.balance = balance;
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[balance=" + balance + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}

public class Fib {

	public static void disp(String[] a) {
		System.out.print("[");
		for (String eleman : a) {
			System.out.print(eleman + " ");
		}
		System.out.print("]\n");

	}

	// pass-by-address reference
	public static void f1(Account a) {
		a.balance = 90.0;
	}

	public static void f2(Account a) {
		a = null;
	}

	public static void fa1(String[] a) {
		a[0] = "Haydar";
	}

	// pass-by-address reference
	public static void fa2(String[] a) {
		a = null;
	}

	// pass-by-value
	public static void fi1(int a) {
		a = 9;
	}

	public static int fib(int n) {
		int previous = 1;
		int current = 1;
		int sayi = 0;
		for (int i = 2; i <= n; i++) {
			sayi = previous + current;
			previous = current;
			current = sayi;
		}
		return sayi;
	}

	// recursive
	public static int fibr(int n) {
		if (n < 2)
			return 1;
		else
			return fibr(n - 1) + fibr(n - 2);
	}

	public static double fact(double n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		// System.out.println(" Fib(7) = " + fib(10));
		// System.out.println(" Fibr(7) = " + fibr(10));
		// System.out.println(" Fact(7) = " + fact(1000000000));
		Account a1 = new Account(80, "8888X");
		Account a2 = new Account(80, "8888XX");

		System.out.println("a1=" + a1);
		System.out.println("a1==a2?" + (a1.equals(a2)));
		f1(a1);
		System.out.println("a1=" + a1);

		f2(a1);
		System.out.println("a1=" + a1);

		String a[] = new String[] { "Hasan", "Huseyin", "Mustafa" };
		disp(a);
		fa1(a);
		disp(a);
		fa2(a);
		disp(a);

		int tt = 888;
		fi1(tt);
		System.out.println("tt=" + tt);

		List<String> isimler = new ArrayList<>();
		isimler.add("Haydar");
		isimler.add("Mustafa");

		for (String isim : isimler) {
			System.out.println("isim=" + isim);
		}

		Map<String, Account> hesaplar = new HashMap<>();
		hesaplar.put(a1.number, a1);
		hesaplar.put(a2.number, a2);
		
		for(String key:hesaplar.keySet()){
			System.out.println("Key="+key+" hesap="+hesaplar.get(key));
		}
		
		System.out.println("Bulunanan hesap="+hesaplar.get("8888XX"));
		
		
		
		
	}

}
