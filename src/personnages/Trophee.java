/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;

	public Trophee(Gaulois g, Equipement e) {
		this.gaulois = g;
		this.equipement = e;
	}

	/**
	 * @return the gaulois
	 */
	public Gaulois getGaulois() {
		return gaulois;
	}

	/**
	 * @return the equipement
	 */
	public Equipement getEquipement() {
		return equipement;
	}

	public String donnerNom() {
		return getGaulois().getNom();
	}

}
