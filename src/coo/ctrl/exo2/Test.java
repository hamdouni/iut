package coo.ctrl.exo2;

public class Test {
	public static void AfficherActeur(Acteur a) {
		System.out.println(a + "et gagne " + a.salaire() + " €" );
	}
	public static void main(String[] args) {
		ActeurTheatre JacquesWeber = new ActeurTheatre("Jacques Weber");
		AfficherActeur(JacquesWeber);

		ActeurDeguise jwp = new Perruque(JacquesWeber);
		AfficherActeur(jwp);

		ActeurDeguise jwpm = new Moustache(jwp);
		AfficherActeur(jwpm);
		
		Acteur TomCruise = new ActeurCinema("Tom Cruise");
		AfficherActeur(TomCruise);
		
		Acteur tcp = new Perruque(TomCruise);
		AfficherActeur(tcp);

		Acteur tcpp = new Perruque(tcp);
		AfficherActeur(tcpp);
	}
}