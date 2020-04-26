
public class Gengou {

	public static void main(String[] args) {
		System.out.println("1:昭和 2:平成 3:令和");
		int gengou =new java.util.Scanner(System.in).nextInt();
		System.out.println("年を入力");
		int nen =new java.util.Scanner(System.in).nextInt();

	}
	public static int getSeireki(int gengou,int nen) {
		if( gengou == 3) {
			return 2018+nen;
		}
		if( gengou == 2) {
			return 1988+nen;
		}
		if( gengou == 1) {
			return 1925+nen;
		}
		return 0;
	}
	public static String getGengouName(int gengou) {
		String[] names = {"昭和","平成","令和"};
		return names[gengou-1];
	}


}
