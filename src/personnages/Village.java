/**
 * 
 */
package personnages;

/**
 * @author DVL3633A
 *
 */
public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	/**
	 * @param nom
	 */
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	/**
	 * @param chef the chef to set
	 */
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois g) {
		this.villageois[this.nbVillageois] = g;
		this.nbVillageois++;
	}

	public Gaulois trouverHabitant(int num) {
		return this.villageois[num];
	}

	public void afficherVillageois() {
		Chef c = this.chef;
		System.out.println("Dans " + this.getNom() + " du chef " + c.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < this.nbVillageois; i++) {
			Gaulois g = this.villageois[i];
			System.out.println("- " + g.getNom());
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);

		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);

		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);

		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
