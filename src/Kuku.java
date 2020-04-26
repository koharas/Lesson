
public class Kuku {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++ ) {
			mondai();
		}
	}

	public static void mondai() {
		int num1 = new java.util.Random().nextInt(9) + 1;
		int num2 = new java.util.Random().nextInt(9) + 1;

		System.out.println(num1 + "×" + num2 + "=");

		int kotae = new java.util.Scanner(System.in).nextInt();
		if( kotae == 0) {
			//break;
		}

		int seikai = num1 * num2;

		if( kotae == seikai) {
			System.out.println("正解！");
		}else {
			System.out.println("間違い！正解は" + seikai);
		}
	}

}
