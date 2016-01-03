package coo.observer.cours.q1;

import java.util.ArrayList ;


/**
 * @author dominique
 * teste les Noeuds pour faire un Graph (avec le design Pattern Observateur)
 *
 */
public class TestObservateur 
{

	public static void main(String[] args) 
	{
		
								// question 1) 
		
		NoeudSujet  n0 = new NoeudSujet("n0", 0, 2) ;
		Observateur n1 = new NoeudObservateur(n0, "n1", 0, 1) ;
		Observateur n2 = new NoeudObservateur(n0, "n2", 0, 4) ;
		Observateur n3 = new NoeudObservateur(n0, "n3", 0, 5) ;
		
		System.out.println(n0) ;
		System.out.println(n1) ;
		System.out.println(n2) ;
		System.out.println(n3) ;
		System.out.println() ;
		
		n0.changementValeur(1) ;
		
		System.out.println()   ;
		System.out.println(n0) ;
		System.out.println(n1) ;
		System.out.println(n2) ;
		System.out.println(n3) ;
		
	}
	
}
// fin classe TestObservateur
