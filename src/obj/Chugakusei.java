package obj;

public class Chugakusei extends Seito{
	int eigo;

	public Chugakusei(String name, int kokugo, int sansu, int shakai, int eigo) {
		super(name, kokugo, sansu, shakai);
		this.eigo = eigo;
	}
	public int goukei() {
		return super.goukei()+this.eigo;
	}
}
