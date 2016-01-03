package coo.ctrl.exo2;

public class Moustache extends ActeurDeguise {
	public Moustache(Acteur unActeur) {
		super(unActeur);
	}

	public int salaire() {
		return this.getActeur().salaire() + 50;
	}

	public String toString() {
		return super.toString() + "avec une moustache ";
	}
}
