package keisho;

public class Hero {
	String name="ミナト";
	int hp=100;

	public Hero() {

	}

	public Hero(String name) {
		this.name = name;
		System.out.println("Heroのコンストラクタ");
	}

	public void attack(Matango m) {
		// mのHPが5減る
		m.hp -= 5;
		System.out.println(this.name+"の攻撃！");
		System.out.println("5ダメージ");
		System.out.println("残りHP" + m.hp);
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
