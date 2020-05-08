package event;

public class EventMain {
	public static void main(String[] args) {
		Event e = new Event("春の人狼大会");

		e.add(new Sankasha("田中",30));
	}
}
