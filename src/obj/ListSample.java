package obj;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");

		//System.out.println(names.get(1));

		for( String n : names ) {
			System.out.println(n);
		}

		ArrayList<Sankaku> slist = new ArrayList<Sankaku>();
		slist.add( new Sankaku(10,5) );
		slist.add( new Sankaku(8,5) );
		slist.add( new Sankaku(20,10) );

		for( Sankaku s :  slist ) {
			s.menseki();
		}

	}

}
