
public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		System.out.println("終わりました");

		//int kotae = keisan(10,20);
		System.out.println( keisan(10,20) );

		int g = goukei(100);
		System.out.println( g );

		show("田中",30);

		for(int i=10;i<=20;i++) {
			jijo(i);
		}

		String[] names = {"山本","佐藤","鈴木"};
		for(String n : names) {
			hello(n);
		}
		if( isGuusu(9) ) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		System.out.println( getTimeName(13) );

		int[] nums = {5,8,9,2};
		printArray(nums);

		String data = "apple,orange,lemon";
		String[] fruits = data.split(",");
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);

		int num = getLast(nums);
		System.out.println(num);
	}

	public static  int getLast(int[] array) {
		return array[ array.length - 1];
	}

	public static void printArray(int[] array) {
		for( int num : array) {
			System.out.println(num);
		}
	}

	public static String getTimeName( int hour) {
		if( hour >= 0 && hour <= 11 ) { //ガード節
			return "午前";
		}
		if( hour >= 12 && hour <= 24 ) { //ガード節
			return "午後";
		}
		return "エラー";
	}


	public static boolean isGuusu( int num  ) {
		// return ( num % 2 == 0);

		if( num % 2 == 0) {
			return true;
		}

		return false;

	}

	public static void jijo(int num) {
		System.out.println(num*num);
	}
	public static void jijo(double num) {
		System.out.println(num*num);
	}

	public static void test(int x) {
		x = 20;
	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

	public static int keisan(int x,int y) {
		return x+y;
	}

	public static int goukei(int num) {
		int sum=0;
		for(int i=1 ; i<=num ;i++) {
			sum += i;
		}
		return sum;
	}
	public static void show(String name,int age) {
		System.out.println(name + "さんは"+age+"才です");
	}

}




