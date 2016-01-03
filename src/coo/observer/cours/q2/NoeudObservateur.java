package coo.observer.cours.q2;

import java.util.ArrayList ;

public class NoeudObservateur extends Noeud implements Observateur
{
	

	/**
	 * initialise le NoeudObservateur avec unNom, uneValeur et unCoefficient
	 * et l'initialise avec uneValeur et unCoefficient
	 */
	public NoeudObservateur(ArrayList<Sujet> s, String unNom, int uneValeur, int unCoefficient) 
	{
		super(unNom, uneValeur, unCoefficient) ;
		
		
							// on enregistre l'Observateur courant aupres de tous ses sujets
		for (int i = 0 ; i < s.size() ; i++)
		{	
			s.get(i).enregistrerObservateur(this) ;
		}	
	}

	
	/**
	 *  met a jour le NoeudObservateur avec uneValeur
	 *  et affiche le noeud a jour
	 */
	public void actualiser(int uneValeur)
	{
		this.majValeur(uneValeur);
	}
	
}
// fin classe NoeudObservateur 
