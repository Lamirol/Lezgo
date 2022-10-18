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
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	/**
	 * @param nom
	 * @param force
	 */
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert (this.force > 0);
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

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);

		if (forceCoup <= 0) {
			parler("Même pas mal !");

		} else {
			force -= forceCoup;
			if (force >= 0) {
				parler("Aïe");
			} else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
			}
		}

		// post condition la force à diminuer
		assert force <= oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement e) {
		String soldat = "Le soldat";
		switch (this.nbEquipement) {
		case 0:
			ajoutEquipement(e);
			break;

		case 1:
			if (this.equipements[0] == e) {
				System.out.println(soldat + this.getNom() + " possède déjà un " + e + ".");
			} else {
				ajoutEquipement(e);
			}
			break;

		case 2:
			System.out.println(soldat + this.getNom() + " est déjà bien protégé !");
			break;
		default:
			System.out.println("Erreur");
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
