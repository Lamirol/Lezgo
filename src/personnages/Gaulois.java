/**
 * 
 */
package personnages;

/**
 * @author DVL3633A
 *
 */
public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	/**
	 * @param nom
	 * @param force
	 */
	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement[] tropheesRecus = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesRecus != null && i < tropheesRecus.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesRecus[i];
		}
	}

	public void faireUneDonation(Musee m) {
		// TODO
	}

//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est " + this.effetPotion + " fois d�cupl�e.");
	}
}
