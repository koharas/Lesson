package rental;

import java.util.ArrayList;

public class Rental {
	ArrayList<Item> list = new ArrayList<Item>();

	void add(Item item) {
		list.add(item);
		//item.days = 100;
	}

	void show() {
		for(Item item : list) {
			System.out.println(item);
		}
	}

	int getGoukei() {
		int sum=0;
		for(Item item : list) {
			sum += item.getPrice();
		}
		return sum;

	}
}
