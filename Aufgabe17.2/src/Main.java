
public class Main {

	public static void main(String[] args) {
		Bestand bestand = new Bestand();
		Auto a = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		a.zumBestandHinzu(bestand);
		a = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", false, "Benzin", 75.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Ford", 12500, 12999.99, "silber metallic", false, "Super", 121.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 6300, 32999.99, "blue silver", false, "Super", 137.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Ford", 1700, 17999.99, "silber metallic", false, "Diesel", 101.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Elektro", 37.0);
		a.zumBestandHinzu(bestand);
		
		a = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		a.zumBestandHinzu(bestand);
		
		System.out.print("Der Erlös in Euro: ");
		System.out.println(bestand.getNachlassEuro(0.1, 0.25)+"€");
		System.out.print("Der Erlös in Prozent: ");
		System.out.println(bestand.getNachlassProzent(0.1, 0.25)+"%");
	}

}
