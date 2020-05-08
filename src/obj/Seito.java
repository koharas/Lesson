package obj;

public class Seito {
	private String name;
	private int kokugo;
	private int sansu;
	private int shakai;

	public Seito(String name, int kokugo, int sansu, int shakai) {
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
		this.shakai = shakai;
	}

	void show() {
		System.out.println(name
				+ "国語" + kokugo + "点 "
				+ "算数" + sansu + "点 "
				+ "社会" + shakai + "点 ");
	}

	int goukei() {
		return this.kokugo+this.sansu+this.shakai;
	}

	double heikin() {
		return this.goukei()/3.0;
	}
}
