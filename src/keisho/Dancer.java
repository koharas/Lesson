package keisho;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name+"は踊った");
	}

	public void attack(Matango m) {
		m.hp -= 3;
	}

}
