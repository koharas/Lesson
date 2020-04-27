
public class Fukushu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};

		// 拡張forで全部表示
		for(int t : tensus) {
			System.out.println(t);
		}

		// 合計を求める
		int sum=0;
		for(int t : tensus) {
			sum += t;
		}
		System.out.println(sum);

		// 70点以上は何人かを求める
		int count=0;
		for(int t : tensus) {
			if( t >= 70) {
				count++;
			}
		}
		System.out.println(count+"人");
	}

}
