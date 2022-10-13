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
		for(int i=0; i<this.nbVillageois; i++) {
			Gaulois g = this.villageois[i];
			System.out.println("- " + g.getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		at personnages.Village.trouverHabitant(Village.java:44)
//		at personnages.Village.main(Village.java:49)
//		On obtient une telle erreur car la variable tableau villageois n'a pas d'indice 30, ayant initialisé le tableau à 30
//		les indices vont de 0 à 29.
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
//		village.ajouterHabitant(abraracourcix);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//			The method ajouterHabitant(Gaulois) in the type Village is not applicable for the arguments (Chef)
//			Syntax error, insert "}" to complete ClassBody
//
//			at personnages.Village.main(Village.java:56)
//		
//		L'instance abraracourcix est de la classe Chef et non Gaulois, notre méthode ajouterHabitant
//		n'accepte en paramètre que les gaulois.
//		Sinon, le retour aurait été "null" car il n'y a pas de villageois à l'indice 1, Asterix se trouvant à l'indice 0
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
