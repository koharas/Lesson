package obj;

public class DensiMoney {
	private int kingaku=0;
	private int point=0;

	public int getKingaku() {
		return kingaku;
	}

	public int getPoint() {
		return point;
	}

	void charge(int m) {
		this.kingaku += m;
	}

	void buy(int m) {
		// 現在の金額以上使おうとしたら「残額が足りません」
		if( this.kingaku >= m) {
			this.kingaku -= m;
			this.point += m * 0.05;
		}else {
			System.out.println("残額が足りません");
		}
	}
	void change() {
		this.kingaku += this.point;
		this.point = 0;
	}
}
