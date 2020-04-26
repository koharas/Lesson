public class Hairetu {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[5];

		scores[0] = 20;

		System.out.println(scores.length);

		String str = "あいう";
		System.out.println(str.length());


		int[] prices = {100,200,150};

		for(int i=0; i<3 ;i++) {
			System.out.println( prices[i] );
		}

		String[] names = {"コーラ","コーヒー","水"};

		for(int i=0; i<3 ;i++) {
			System.out.println( names[i] );
		}

		int[] points = {80,90,60,70,50};
		int sum=0;
		for(int i=0; i<points.length ;i++) {
			sum += points[i];
		}
		System.out.println(sum);

		int count=0;
		for(int i=0; i<points.length ;i++) {
			if( points[i] >= 70 ) {
				count++;
			}
		}
		System.out.println(count);

		int[] seq = {0,1,0,2,3,0};

		for(int i=0; i<seq.length;i++) {
			// seq[i]が0ならA
			//         1ならT
			//         2ならG
			//         3ならC
			char[] base = {'A','T','G','C'};
			System.out.println( base[ seq[i] ] );
		}


	}
}
