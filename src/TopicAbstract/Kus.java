package TopicAbstract;

public class Kus extends Canli {

	public void uc() {

		System.out.println("U�uyorum");
	}

	//Abstract metodu interface gibi kullanmak i�in bu metotlar� overredi ettik
	@Override
	public void NefesAl() {
		System.out.println("Akci�er Solunumu Yap�yorum");
		
	}

	@Override
	public void HereketEt() {
		System.out.println("Y�r�yebiliyor ve u�abiliyorum");
		
	}


}
