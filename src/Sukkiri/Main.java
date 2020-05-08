package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);

		Sword s = new Sword("炎の剣",10);

		Hero h = new Hero("ミナト");
		Hero h2 = new Hero("ヤマダ");
		Hero h3 = Hero.createHero();


		Hero.money = 500;

		System.out.println(Hero.money);

//		h.setName("タナカ");
//		h.setSword(s);
//		System.out.println("勇者"+h.getName()+"を生み出しました");
//		System.out.println("現在の武器は" + h.getSword().getName());
//
//		h.setHp(-100);
//		System.out.println(h.getHp());
		//h.die();

//		Wizard w = new Wizard();
//		w.name = "スガワラ";
//		w.hp = 50;
//		w.heal(h);
//
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//
//		h.attack(m1);
//
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();

	}

}
