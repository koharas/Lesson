package Sukkiri;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public Hero(String n) {
		this.hp = 100;
		this.name = n;
	}

	public Hero() {
		this("ダミー");
	}

	public void attack(Matango m) {
		// mのHPが5減る
		m.hp -= this.sword.damage;
		System.out.println(this.name+"の攻撃！");
		System.out.println("ダメージ" + this.sword.damage+"!");
		System.out.println("残りHP" + m.hp);
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
