package coo.observer.cours.q1;


/**
 * @author Dominique Bouthinon
 *
 */
public class NoeudObservateur extends Noeud implements Observateur
{
	

	/**
	 * initialise le NoeudObservateur avec unNom, uneValeur et unCoefficient
	 * et l'initialise avec uneValeur et unCoefficient
	 */
	public NoeudObservateur(Sujet s, String unNom, int uneValeur, int unCoefficient) 
	{
		super(unNom, uneValeur, unCoefficient) ;
		s.enregistrerObservateur(this) ;
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
