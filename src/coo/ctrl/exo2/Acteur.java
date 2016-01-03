package coo.ctrl.exo2;

public abstract class Acteur {

	private String nom;

	public Acteur() {}

	public Acteur(String unNom) {
		setNom(unNom);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public String toString() {
		return this.getNom();
	}

	public abstract int salaire();
}