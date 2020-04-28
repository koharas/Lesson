package obj;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher("山田");
		t.show();

		Sankaku s = new Sankaku(10,5);
		s.menseki();

		Shouhin shouhin = new Shouhin("りんご",100);
		shouhin.show();
		shouhin.showTax();

		Uriage uri = new Uriage();
		uri.kosu = 5;
		uri.shouhin = shouhin;
		uri.show();
		uri.showUriage();

		Shouhin sho2 = new Shouhin("みかん",150);

		Uriage uri2 = new Uriage();
		uri2.kosu = 3;
		uri2.shouhin = sho2;
		uri2.show();
		uri2.showUriage();

		En en = new En();
		en.hankei = 10;
		en.menseki();
		en.enshu();

		DensiMoney dm = new DensiMoney();
		dm.charge(1000);
		dm.buy(500);

		System.out.println(dm.kingaku+"円");
		System.out.println(dm.point+"ポイント");

		dm.change();
		System.out.println(dm.kingaku+"円");
		System.out.println(dm.point+"ポイント");

		Hizuke h1 = new Hizuke(4,27);
		h1.show();

		Hizuke h2 = new Hizuke(5,7);
		h2.show();

		Nichiji n = new Nichiji(4,28,13,30);
		n.show();
		n.showJikan();


	}

}





