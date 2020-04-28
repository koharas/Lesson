package obj;

public class Nichiji extends Hizuke{
	int ji;
	int hun;

	public void show() {
		// 親のshowを呼び出す
		super.show();

		// 自分のshowJikanを呼び出す
		showJikan();
	}
	public void showJikan() {
		System.out.println(this.ji + "時" + this.hun + "分");
	}
}
