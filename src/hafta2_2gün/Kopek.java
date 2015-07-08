package hafta2_2gün;

public class Kopek implements Hayvan {

	
public Kopek(){
	
}
private int yas=1;

	public String sesCýkar() {
		// TODO Auto-generated method stub
		return ("Hav Hav... ");
	}

	public String yürü() {
		// TODO Auto-generated method stub
		return ("Yürüdüm... ");
	}

	public int yasSoyle() {
		// TODO Auto-generated method stub
		return this.yas;
	}
	
	public void setYas(int yas){
		this.yas= yas;
	}

}
