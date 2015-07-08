package TopicInterface;

public class Cocuk implements Anne,Baba {

	@Override
	public void yuru() {
		System.out.print("Yürüdüm\n");
		
	}

	@Override
	public void kos() {
		System.out.print("Koþtum\n");
		
	}

	@Override
	public void sev() {
		System.out.print("Seni Seviyorum\n");		
	}

	@Override
	public void gülümse() {
		System.out.print("Gülümsedim\n");
		
	}

}
