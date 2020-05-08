package event;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
	private String name;
	private Date hi;
	private List<Sankasha> list = new ArrayList<>();

	public Event(String name) {
		this.name = name;
		this.hi = new Date();
	}

	public void add(Sankasha s) {
		list.add(s);
	}

	public void show() {
		System.out.println(this.name);

		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(f.format(this.hi));

		for(Sankasha s : list) {
			System.out.println(s.getName() + " " + s.getAge() + "歳");
		}
	}


}
