package coo.observer.bh;

public class TestObservateur {

	public static void main(String[] args) {
		NoeudSujet n0 = new NoeudSujet(0,0,2);
		NoeudSujetObservateur n1 = new NoeudSujetObservateur(1,0,1);
		NoeudSujetObservateur n2 = new NoeudSujetObservateur(2,0,4);
		NoeudObservateur n3 = new NoeudObservateur(3,0,3);
		n0.registerObserver(n1);
		n0.registerObserver(n2);
		n1.registerObserver(n3);
		n2.registerObserver(n3);
		
		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		System.out.println("change value n0 to 1");
		n0.update(1);

		System.out.println(n0);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

	}

}
