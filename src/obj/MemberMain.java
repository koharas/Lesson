package obj;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member("田中","096-111-2222");
		//m.show();
		System.out.println(m);

		NetMember nm = new NetMember("山田","096-222-3333","aaa@bbb.com");
		//nm.show();
		System.out.println(nm);

		// 	半径10の円の面積
		En en = new En(10);
		en.menseki();

	}
}
