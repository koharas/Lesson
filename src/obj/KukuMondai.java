package obj;

public class KukuMondai {
	int num1;
	int num2;

	public KukuMondai() {
		this.num1 = new java.util.Random().nextInt(9) + 1;
		this.num2 = new java.util.Random().nextInt(9) + 1;
	}
	public void show() {
		System.out.println(this.num1 + "×" + this.num2 + "=");
	}
	public void check(int kotae) {
		int seikai = this.num1 * this.num2;

		if( kotae == seikai) {
			System.out.println("正解！");
		}else {
			System.out.println("間違い！正解は" + seikai);
		}
	}
}
