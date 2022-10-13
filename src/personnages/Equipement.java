package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private final String nom;
	
	Equipement(String n) {
		this.nom = n;
	}
	
	@Override
	public String toString(){
		return nom;
	}

}
