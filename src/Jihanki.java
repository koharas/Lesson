
public class Jihanki {

	public static void main(String[] args) {
		System.out.println("何番ですか？");
		int num =new java.util.Scanner(System.in).nextInt();

		// 0と入れたらコーヒー
		// 1と入れたらお茶
		// 2と入れたらサイダー
		// 表引き
		String[] drinks = {"コーヒー","お茶","サイダー"};
		System.out.println( drinks[ num ] );

	}

}
