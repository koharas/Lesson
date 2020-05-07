package obj;

public class Shikaku implements Zukei{
	int haba;
	int takasa;

	public Shikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println(haba*takasa);
	}
}
