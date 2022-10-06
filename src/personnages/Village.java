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
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		at personnages.Village.trouverHabitant(Village.java:44)
//		at personnages.Village.main(Village.java:49)
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.ajouterHabitant(abraracourcix);
}
