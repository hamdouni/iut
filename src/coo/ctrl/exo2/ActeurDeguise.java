package coo.ctrl.exo2;

public abstract class ActeurDeguise extends Acteur {

	private Acteur acteur;

	public ActeurDeguise(Acteur unActeur) {
		this.acteur = unActeur;
	}

	public Acteur getActeur() {
		return this.acteur;
	}

	public abstract int salaire();

	public String toString() {
		return this.getActeur().toString();
	}

	public String getNom() {
		return this.getActeur().getNom();
	}
}
