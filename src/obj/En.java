package obj;

public class En implements Zukei{
	int hankei;

	public En(int hankei) {
		this.hankei = hankei;
	}
	public void menseki() {
		System.out.println(hankei*hankei*3.14);
	}
	void enshu() {
		System.out.println(2*hankei*3.14);
	}
}
