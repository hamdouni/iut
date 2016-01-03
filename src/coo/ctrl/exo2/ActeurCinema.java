package coo.ctrl.exo2;

public class ActeurCinema extends Acteur {
	public ActeurCinema(String unNom) {
		super(unNom);
	}

	public int salaire() {
		return 10000;
	}

	public String toString() {
		return super.toString() + " joue au cinéma ";
	}
}
