package sales;

public class Sales {
	private String name;
	private int kingaku;

	public Sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}

	public String getName() {
		return name;
	}

	public int getKingaku() {
		return kingaku;
	}
	public int getSouryou() {
		if( this.kingaku >= 3000) {
			return 0;
		}
		return 500;
	}
	public int getTotal() {
		return this.getKingaku()+this.getSouryou();
	}
	public String toString() {
		return this.name + " " + this.getKingaku()
		+ "円 送料"	+ this.getSouryou() + "円";
	}
}
