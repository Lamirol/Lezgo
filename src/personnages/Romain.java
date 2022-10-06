/**
 * 
 */
package personnages;

/**
 * @author DVL3633A
 *
 */
public class Romain {
	private String nom; 
	private int force;
	
	/**
	 * @param nom
	 * @param force
	 */
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
}
