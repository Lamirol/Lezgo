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
	private  Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	/**
	 * @param nom
	 * @param force
	 */
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert(this.force > 0);
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
		int forceIni = force;
		assert(forceIni > 0);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe !");
			
		} else {
			parler("J'abandonne...");
		}

		assert(forceIni > force);
	}
	
	public void sEquiper(Equipement e) {
		switch (this.nbEquipement) {
			case 0:
			ajoutEquipement(e);
				break;
				
			case 1:
				if (this.equipements[0] == e) {
					System.out.println("Le soldat " + this.getNom() + " possède déjà un " + e + ".");
				} else {
					ajoutEquipement(e);
				}
				break;
				
			case 2:
				System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
				break;
			}
	}

	/**
	 * @param e
	 */
	private void ajoutEquipement(Equipement e) {
		this.equipements[this.nbEquipement++] = e;
		System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + e + ".");
	}
	
	public static void main(String[] args) {
		Equipement e1 = Equipement.CASQUE;
		Equipement e2 = Equipement.BOUCLIER;
		System.out.println(e1 + "\n" + e2);
		Romain r = new Romain("Minus", 6);
		r.sEquiper(e1);
		r.sEquiper(e1);
		r.sEquiper(e2);
		r.sEquiper(e2);
	}
}
