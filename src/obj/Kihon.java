package obj;

public class Kihon extends Shiken{
	int gozen;
	int gogo;

	public Kihon(int gozen, int gogo) {
		super("基本情報技術者");
		this.gozen = gozen;
		this.gogo = gogo;
	}

	void showGokaku() {
		if( gozen >= 60 && gogo >= 60 ) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}

	}



}
