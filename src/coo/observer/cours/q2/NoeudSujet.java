package coo.observer.cours.q2;

import java.util.ArrayList ;

/**
 * @author dominique
 *
 */
public class NoeudSujet extends Noeud implements Sujet 
{
	private ArrayList<Observateur> observateurs ; 
	
	
	/**
	 * 		initialise le NoeudSujet avec uneValeur et unCoefficient
	 * 		et pas d'observateur
	 */
	public NoeudSujet(String unNom, int uneValeur, int unCoefficient) 
	{
		super(unNom, uneValeur, unCoefficient) ;
		this.observateurs = new ArrayList<Observateur>() ;
	}
	
	
	public void enregistrerObservateur(Observateur o) 
	{
		this.observateurs.add(o) ;
	}
	
	
	public void supprimerObservateur(Observateur o)
	{
		this.observateurs.remove(o) ;
	}
	
	
	public void notifierObservateurs()
	{
		for(int i = 0 ; i < this.observateurs.size(); i++)
		{
			this.observateurs.get(i).actualiser(this.getValeur());
		}
	}
	
	
	/**
	 * 	on utilise uneValeur pour modifier la valeur du noeud
	 */
	public void changementValeur(int uneValeur)
	{
		this.majValeur(uneValeur) ;
		this.notifierObservateurs() ;
	}
	
}
// fin classe NoeudSujet
