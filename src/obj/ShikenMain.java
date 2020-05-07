package obj;

public class ShikenMain {

	public static void main(String[] args) {
		// ITパスポート
		// 合格
		ItPassport ip = new ItPassport();
		ip.tensu=70;
		ip.show();

		// 基本情報クラス Kihon
		// フィールド int gozen,int gogo
		// 両方とも60点以上で合格
		Kihon k = new Kihon(70,50);
		k.show();

		//Shiken s = new Shiken("試験");

	}

}
