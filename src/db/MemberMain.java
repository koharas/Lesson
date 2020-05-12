package db;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> list = dao.findAll();
		for(Member m : list) {
			System.out.println(m.getMid() + ":" + m.getName());
		}

		System.out.println("どの住所を見たいですか？");
		int mid = new java.util.Scanner(System.in).nextInt();

		Member m = dao.findByMid(mid);
		System.out.println(m.getAdr());

	}

}
