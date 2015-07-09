package hata;

class Account{
	private String number;
	private double balance;
	
	public Account(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

class HesapEksiException extends Exception{

	public HesapEksiException(String message) {
		super(message);
	}
	
}

class HesapBosException extends Exception{

	public HesapBosException(String message, Exception e) {
		super(message, e);
	}
	public HesapBosException(String message) {
		super(message);
	}
	
}
public class TestHata {

	
	public static void transferAccount(Account account) throws HesapEksiException, HesapBosException{
		if(account.getBalance() < 0) throw new HesapEksiException("Miktar eksi");
		if(account.getBalance() == 0) throw new HesapBosException("Miktar 0");
		
		System.out.println("BU METHOD BITTI");
		
	}
	
	
	public static void hesapDuzenle(String number, double balance) throws HesapBosException{
		Account a = new Account(number, balance);
		try {
			transferAccount(a);
			System.out.println("Aslinda hata olmadigi icin burdayim.");
		} catch (HesapEksiException e) {
			System.out.println("HATA YAKALANDI"+e.getMessage());		
			
		} finally{
			System.out.println("HER ZAMAN BURDAYIM");
		}
		System.out.println("DONE");
	}
	
	
	public static void main(String[] args)  {
		try {
			hesapDuzenle("79797x",90);
		} catch (HesapBosException e) {
			System.out.println("Arkadas delimisin. Senin hesabinda para YOK:"+e.getMessage());
		}

	}

}
