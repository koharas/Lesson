package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
		// ビール 500ml
		// アルコール 0.05
		//Sake s = new Sake("ビール",500,0.05);
		//s.show();

		ArrayList<Drink> dlist = new ArrayList<Drink>();

		dlist.add( new Drink("コーラ",500) );
		dlist.add( new Drink("サイダー",350) );
		dlist.add( new Drink("コーヒー",200) );
		dlist.add( new Sake("ビール",500,0.05));

		int sum=0;
		for( Drink d : dlist ) {
			d.show();
			sum += d.getAmount();
		}
		System.out.println(sum + "ml");

	}

}
