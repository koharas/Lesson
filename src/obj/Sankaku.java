package obj;

public class Sankaku implements Zukei{
	int teihen;
	int takasa;

	public Sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println(teihen*takasa/2);
	}
}
