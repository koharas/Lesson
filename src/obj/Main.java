package obj;

public class Main {

	public static void main(String[] args) {
		Sankaku s = new Sankaku();
		s.teihen = 10;
		s.takasa = 5;
		s.menseki();

		Shouhin shouhin = new Shouhin();
		shouhin.name = "りんご";
		shouhin.price = 100;
		shouhin.show();
		shouhin.showTax();

		Uriage uri = new Uriage();
		uri.kosu = 5;
		uri.shouhin = shouhin;
		uri.show();
		uri.showUriage();

		Shouhin sho2 = new Shouhin();
		sho2.name = "みかん";
		sho2.price = 150;

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

		Hizuke h1 = new Hizuke();
		h1.tuki = 4;
		h1.hi = 27;
		h1.show();

		Hizuke h2 = new Hizuke();
		h2.tuki = 5;
		h2.hi = 7;
		h2.show();


	}

}





