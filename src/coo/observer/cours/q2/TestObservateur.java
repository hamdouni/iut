package coo.observer.cours.q2;

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
		
							// question 2
							 
							 
		NoeudSujet  n0 = new NoeudSujet("n0", 0, 2) ;
		
		ArrayList<Sujet> s1 = new ArrayList<Sujet>() ;
		s1.add(n0) ;
		
		NoeudSujetObservateur n1 = new NoeudSujetObservateur(s1, "n1", 0, 1) ;
		NoeudSujetObservateur n2 = new NoeudSujetObservateur(s1, "n2", 0, 4) ;
		
		
		ArrayList<Sujet> s2 = new ArrayList<Sujet>() ;
		s2.add(n1) ;
		s2.add(n2) ;
		
		Observateur n3 = new NoeudObservateur(s2, "n3", 0, 3) ;
		
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
