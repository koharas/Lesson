package event;

public class EventMain {
	public static void main(String[] args) {
		Event e = new Event("春の人狼大会");

		try {
			e.add(new Sankasha("",30));
			e.add(new Sankasha("山田",-1));
			e.add(new Sankasha("山本",35));
		}catch(SankashaException ex) {
			System.out.println("エラー:" + ex.getMessage());
		}
		e.show();
	}
}
