package TopicAbstract;

public class Kus extends Canli {

	public void uc() {

		System.out.println("Uçuyorum");
	}

	//Abstract metodu interface gibi kullanmak için bu metotlarý overredi ettik
	@Override
	public void NefesAl() {
		System.out.println("Akciðer Solunumu Yapýyorum");
		
	}

	@Override
	public void HereketEt() {
		System.out.println("Yürüyebiliyor ve uçabiliyorum");
		
	}


}
