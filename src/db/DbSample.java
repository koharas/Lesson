package db;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class DbSample {

	public static void main(String[] args) {
		ShouhinDAO dao = new ShouhinDAO();

		// すべて検索
		ArrayList<Shouhin> slist = dao.findAll();
		for( Shouhin s : slist) {
			System.out.println(s.getSname());
		}

		// 1つだけ検索
		Shouhin s = dao.findBySid(1);
		System.out.println(s.getSname());

		// 追加
		//Shouhin s1 = new Shouhin(0, "バナナ",110);
		//dao.insert(s1);

		// 変更
		Shouhin s2 = new Shouhin(4, "メロン",600);
		dao.update(s2);

		// 削除
		dao.delete(7);

		// 売上
		UriageDAO udao = new UriageDAO();

		// 売上すべて検索
		ArrayList<Uriage> list = udao.findAll();
		for( Uriage u : list) {
			System.out.println(u.getHi());
		}

		// 1つだけ検索
		Uriage u = udao.findByUid(1);
		System.out.println(u.getHi());

		// sidで検索
		ArrayList<Uriage> ulist = udao.findBySid(1);
		for(Uriage uri : ulist) {
			System.out.println(uri.getHi());
		}

		// 追加
		Uriage u2 = new Uriage(0,1,2,null);
		udao.insert(u2);

		// 変更
		Calendar c = Calendar.getInstance();
		c.set(2020,4-1,1);
		Date hi = new Date(c.getTimeInMillis());
		Uriage u3 = new Uriage(5,3,2,hi);
		udao.update(u3);

		// 削除
		udao.delete(7);

	}



}
