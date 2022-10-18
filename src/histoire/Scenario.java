package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 10);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois("Astérix", 8);
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		Equipement e1 = Equipement.CASQUE;
		Equipement e2 = Equipement.BOUCLIER;
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(e2);
		minus.sEquiper(e1);
		Romain milex = new Romain("Milexcus", 8);
		milex.sEquiper(e1);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(milex);
	}

}