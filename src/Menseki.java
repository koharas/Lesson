
public class Menseki {

	public static void main(String[] args) {
		// 1.メソッド enMensekiを作る
		//   引数 int hankei
		//   hankei*hankei*3.14 を表示
        //   mainから呼び出し半径10の円の面積
		double m = enMenseki(10);
		System.out.println(m);

		// 2.半径1から5の円の面積を表示(for)
		for(int i=1;i<5;i++) {
			System.out.println( enMenseki(i) );
		}

		// 3.半径 3 8 20 の円の面積を表示（配列）
		int[] hankeis = {3,8,20};
		for(int h: hankeis) {
			double men = enMenseki(h);
			System.out.println(men);
		}

		int s = sankakuMenseki(10, 5);
		System.out.println(s);
	}
	public static double enMenseki(int hankei) {
		return (hankei*hankei*3.14);
	}

	public static int sankakuMenseki(int teihen,int takasa) {
		return teihen * takasa / 2;
	}

}
