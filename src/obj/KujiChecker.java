package obj;

public class KujiChecker {
	int kingaku;

	void check(Kuji k) {
		if( k.bangou == 123456) {
			k.kekka="１等";
			this.kingaku += 100000;
		}else if( k.bangou % 100 == 12) {
			k.kekka="２等";
			this.kingaku += 1000;
		}else {
			k.kekka="はずれ";
		}
	}
}
