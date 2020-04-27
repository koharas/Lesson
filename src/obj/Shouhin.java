package obj;

public class Shouhin {
	String name;
	int price;

	void show() {
		System.out.println(this.name + " " + this.price + "円");
	}
	void showTax() {
		System.out.println(this.price * 0.1 + "円");
	}
}
