package obj;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> list = new ArrayList<KukuMondai>();

		for(int i=0;i<5;i++) {
			list.add( new KukuMondai());
		}

		for(KukuMondai m : list) {
			m.show();
			int kotae = new java.util.Scanner(System.in).nextInt();
			m.check(kotae);
		}
	}
}
