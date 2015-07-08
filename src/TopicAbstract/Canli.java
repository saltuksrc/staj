package TopicAbstract;

/*
 Abstract s�n�f, �zet s�n�f anlam�na gelmektedir ve i�eri�inde hem normal
 s�n�f �yelerini bar�nd�rabildi�i gibi hem de interface (aray�z)
 �yelerini bar�nd�rabilen �zel bir class tipidir.
 */
/*
 Bu s�n�f�n en �nemli �zelli�i hem s�n�f hem de interface gibi
 kullan�labilmesinden �te "new" s�zc���yle instance
 alabilinememesidir,yani abstract bir s�n�f� do�rudan kullanamazs�n�z
 */

public abstract class Canli {
	// Propertyler
	public String cins;
	public int yas;
	public int boy;
	public double agirlik;

	// Metotlar

	public void yasa() {
		System.out.println("Ya��yorum");
	}

	public void ol() {
		System.out.println("Art�k �ld�m");

	}
	
	public abstract void NefesAl();
	public abstract void HereketEt();

}
