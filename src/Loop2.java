
public class Loop2 {

	public static void main(String[] args) {
		//1.こんにちは と5回表示
		//2. 1 2 3 4 5 と表示
		//3. numに数を入れて0からnumまで表示
		//4. 10以下の偶数を表示（2 4 6 8 10）
		//5. 5 4 3 2 1 と表示

		for(int i=0;i<5;i++) {
			System.out.println("こんにちは");
		}
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		int num = 6;
		for(int i=0;i<=num;i++) {
			System.out.println(i);
		}
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}


		// 6.1から10までの合計を求める
		//   1+2+3+・・+8+9+10=55
		int sum=0;
		for( int i=1 ; i<=10 ;i++ ) {
			sum += i;
		}
		System.out.println(sum);



	}

}
