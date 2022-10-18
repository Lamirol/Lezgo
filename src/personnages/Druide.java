/**
 * 
 */
package personnages;

import java.util.Random;

/**
 * @author DVL3633A
 *
 */
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	private Random random = new Random();

	/**
	 * @param nom
	 * @param effetPotionMin
	 * @param effetPotionMax
	 */
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller " + "d'une force " + effetPotionMin
				+ " à " + effetPotionMax + ".");
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");

	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		this.parler("Je vais aller préparer une petite potion...");
		int rn = this.random.nextInt(effetPotionMax);
		while (rn < effetPotionMin) {
			rn = random.nextInt(effetPotionMax);
		}
		if (rn > 7) {
			this.parler("J'ai préparé une super potion de force " + rn);

		} else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + rn);
		}
		this.forcePotion = rn;
	}

	public void booster(Gaulois g) {
		if ("Obélix".equals(g.getNom())) {
			this.parler(" Non, Obélix !... Tu n’auras pas de potion magique !");

		} else {
			g.boirePotion(this.forcePotion);
		}
	}
}
