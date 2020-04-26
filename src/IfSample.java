
public class IfSample {

	public static void main(String[] args) {
		System.out.println("月を入力：");
		int tuki =new java.util.Scanner(System.in).nextInt();

		switch(tuki) {
		case 2:
			System.out.println("29日");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日");
			break;
		default:
			System.out.println("31日");
			break;
		}




//		System.out.println("番号を入力：");
//		int num =new java.util.Scanner(System.in).nextInt();
//
//		switch(num) {
//		case 1:
//			System.out.println("コーラ");
//			break;
//		case 2:
//		case 4:
//			System.out.println("コーヒー");
//			break;
//		case 3:
//			System.out.println("水");
//			break;
//
//		default:
//			System.out.println("番号が違います");
//			break;
//		}

	}

}
