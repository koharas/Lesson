package Sukkiri;

public class Main {

	public static void main(String[] args) {
		String str = new String("こんにちは");
		System.out.println(str);

		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("勇者"+h.name+"を生み出しました");
		System.out.println("現在の武器は" + h.sword.name);

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h);

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.attack(m1);

		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
