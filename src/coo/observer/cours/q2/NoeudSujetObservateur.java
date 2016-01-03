package coo.observer.cours.q2;

import java.util.ArrayList ;


/**
 * @author Dominique Bouthinon
 *
 */
public class NoeudSujetObservateur extends NoeudSujet implements Observateur
{

	/**
	 * initialise le NoeudSujetObservateur avec unNom, uneValeur et unCoefficient
	 * et l'initialise avec uneValeur et unCoefficient
	 */
	public NoeudSujetObservateur(ArrayList<Sujet> s , String unNom, int uneValeur, int uneCapacite) 
	{
		super(unNom, uneValeur, uneCapacite) ;
		
		
											// on enregistre l'Observateur courant
											// auprès de tous ses sujets
		for (int i = 0 ; i < s.size(); i++)
		{
			s.get(i).enregistrerObservateur(this) ;
		}
	}

	
	/**
	 *  met a jour le NoeudSujetObservateur avec uneValeur
	 *  et affiche le noeud a jour
	 */
	public void actualiser(int uneValeur)
	{
		this.majValeur(uneValeur);
		this.notifierObservateurs() ;
	}
	
}
// fin classe NoeudSujetObservateur 
