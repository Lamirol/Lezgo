/**
 * 
 */
package personnages;

/**
 * @author lucas
 *
 */
public class Musee {
	private final int NBMAXTROPHEE = 200;
	private Trophee[] tabMusee = new Trophee[NBMAXTROPHEE];
	private int nbTrophee = 0;

	public void donnerTrophees(Gaulois g, Equipement e) {
		Trophee t = new Trophee(g, e);
		tabMusee[nbTrophee] = t;
	}

	public String extraireInstructionsCaml() {
		String chaine;
		chaine = "let musee = [\n";
		for (Trophee t : tabMusee) {
			chaine = chaine + "<" + t.getGaulois() + ">, <" + t.getEquipement() + ">;\n";
		}
		chaine = chaine + "]";
		return chaine;
	}
}
