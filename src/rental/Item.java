package rental;

public abstract class Item {
	private String name;
	private int days;

	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public int getDays() {
		return days;
	}

	public abstract int getPrice();

	@Override
	public String toString() {
		return this.name + " " + this.days + "日 " + this.getPrice() + "円";
	}



}
