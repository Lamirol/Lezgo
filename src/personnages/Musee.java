/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Musee {
	private Trophee[] musee = new Trophee[200];
	private int nbTrophee = 0;

	public void donnerTrophees(Gaulois g, Equipement e) {
		Trophee t = new Trophee(g, e);
		musee[nbTrophee] = t;
	}

}
