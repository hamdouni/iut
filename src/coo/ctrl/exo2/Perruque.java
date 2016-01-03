package coo.ctrl.exo2;

public class Perruque extends ActeurDeguise {
	public Perruque(Acteur unActeur) {
		super(unActeur);
	}

	public int salaire() {
		return this.getActeur().salaire() + 100;
	}

	public String toString() {
		return super.toString() + "avec une perruque ";
	}
}
