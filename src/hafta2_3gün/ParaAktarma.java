package hafta2_3gün;

public class ParaAktarma {

	 public static void main(String[] args){
		 
		 BankaHesabı said = new BankaHesabı("654321");
		 said.paraYatır(1100);
		 
		 BankaHesabı davut = new BankaHesabı("654321A");
		 davut.paraYatır(900);
		
		 
		 said.aktar(700, davut);
		 
		 System.out.println("Hesabınızda \'Said'= "+said.getBakiye()+"TL bulunmaktadır...");
		
		 
		 
	 }
}
