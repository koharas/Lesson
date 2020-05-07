package obj;

public class Member {
	String name;
	String tel;

	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	void show() {
		System.out.println(this.name + " " + this.tel);
	}
}
