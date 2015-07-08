package TopicAbstract;

/*
 Abstract sýnýf, özet sýnýf anlamýna gelmektedir ve içeriðinde hem normal
 sýnýf üyelerini barýndýrabildiði gibi hem de interface (arayüz)
 üyelerini barýndýrabilen özel bir class tipidir.
 */
/*
 Bu sýnýfýn en önemli özelliði hem sýnýf hem de interface gibi
 kullanýlabilmesinden öte "new" sözcüðüyle instance
 alabilinememesidir,yani abstract bir sýnýfý doðrudan kullanamazsýnýz
 */

public abstract class Canli {
	// Propertyler
	public String cins;
	public int yas;
	public int boy;
	public double agirlik;

	// Metotlar

	public void yasa() {
		System.out.println("Yaþýyorum");
	}

	public void ol() {
		System.out.println("Artýk Öldüm");

	}
	
	public abstract void NefesAl();
	public abstract void HereketEt();

}
