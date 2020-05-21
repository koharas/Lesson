package sales;

import java.util.ArrayList;
import java.util.List;

public class SalesMain {

	public static void main(String[] args) {
		List<Sales> list = new ArrayList<>();
		list.add( new Sales("田中",1500));
		list.add( new Sales("山田",3000));
		list.add( new MemberSales("田中",1000));

		int sum=0;
		for(Sales s : list) {
			sum += s.getTotal();
			System.out.println(s);
		}
		System.out.println("合計" + sum + "円」");
	}

}
