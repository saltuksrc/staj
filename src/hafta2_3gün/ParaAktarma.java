package hafta2_3g�n;

public class ParaAktarma {

	 public static void main(String[] args){
		 
		 BankaHesab� said = new BankaHesab�("654321");
		 said.paraYat�r(1100);
		 
		 BankaHesab� davut = new BankaHesab�("654321A");
		 davut.paraYat�r(900);
		
		 
		 said.aktar(700, davut);
		 
		 System.out.println("Hesab�n�zda \'Said'= "+said.getBakiye()+"TL bulunmaktad�r...");
		
		 
		 
	 }
}
