package coo.ctrl.exo2;

public class ActeurTheatre extends Acteur {
	public ActeurTheatre(String unNom) {
		super(unNom);
	}

	public int salaire() {
		return 5000;
	}

	public String toString() {
		return super.toString() + " joue au theatre ";
	}
}
