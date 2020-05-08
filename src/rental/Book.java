package rental;

public class Book extends Item{

	public Book(String name, int days) {
		super(name, days);
	}

	@Override
	public int getPrice() {
		return this.getDays()*50;
	}

}
