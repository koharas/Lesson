package obj;

import java.util.ArrayList;

public class KujiMain {
	public static void main(String[] args) {
		ArrayList<Kuji> klist = new ArrayList<Kuji>();

		klist.add( new Kuji(123456));
		klist.add( new Kuji(101012));
		klist.add( new Kuji(654321));
		klist.add( new Kuji(121212));

		KujiChecker kc = new KujiChecker();

		for( Kuji k : klist ) {
			kc.check(k);
			k.show();
		}

		System.out.println( kc.kingaku  );

	}
}
