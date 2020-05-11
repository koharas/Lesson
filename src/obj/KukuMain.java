package obj;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> list = new ArrayList<KukuMondai>();

		for(int i=0;i<5;i++) {
			list.add( new KukuMondai());
		}

		for(KukuMondai m : list) {
			m.show();
			try {
				int kotae = new java.util.Scanner(System.in).nextInt();
				m.check(kotae);
			}catch(InputMismatchException e) {
				System.out.println("数字を入力してください");
			}
		}
	}
}
