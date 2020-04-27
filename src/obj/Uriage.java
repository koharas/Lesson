package obj;

public class Uriage {
	int kosu;
	Shouhin shouhin;

	void show() {
		System.out.println(this.shouhin.name + "は" + this.kosu + "個売れた");
	}
	void showUriage() {
		System.out.println(this.kosu * this.shouhin.price  +"円");
	}
}
