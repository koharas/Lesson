package obj;

public class SeitoMain {
	public static void main(String[] args) {
		Seito s = new Chugakusei("田中",10,10,10,10);
		System.out.println(s.goukei());


//		ArrayList<Chugakusei> list = new ArrayList<Chugakusei>();
//		list.add( new Chugakusei("田中",80,90,50,60));
//		list.add( new Chugakusei("鈴木",70,90,50,40));
//		list.add( new Chugakusei("山田",60,80,60,60));
//
//		int sum=0;
//		for(Chugakusei c:list) {
//			sum += c.goukei();
//		}
//		System.out.println(sum);


	}
}
