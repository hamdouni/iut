package coo.command.cours;

import java.util.ArrayList ;

/**
 * @author Dominique Bouthinon
 * gestionnaire de taches modelise par le design Patter Commande
 * Le GestionnaireTaches est l'invocateur (equivalent Telecommande)
 *
 */
public class GestionnaireTaches 
{

	private ArrayList<Commande> taches ;
	
	/**
	 *	Initialise 
	 */
	public GestionnaireTaches() 
	{
		this.taches = new ArrayList<Commande>() ; 
	}
	
	
	/**
	 * ajoute la tache t au GestionnaireTaches
	 */
	public void ajouterTache(Commande t)
	{
		this.taches.add(t) ;
	}
	
	
	/**
	 * retire la Commande c du GestionnaireTaches
	 */
	public void retirerTache(Commande t) throws Exception
	{
		if (!this.taches.remove(t))
			throw new Exception("impossible de retirer la commande : pas de commande " + t) ;
	}	

	
	
	/**
	 * traite la tache c
	 */
	public void executerLaTache(Commande t)
	{
		int i = this.taches.indexOf(t) ;
		
		if (i >= 0)	
			this.taches.get(i).executer() ;
	}
	
	
	/**
	 * traite la tache la plus ancienne
	 */
	public void executerUneTache()
	{
		if (!this.taches.isEmpty())
		{
			this.taches.remove(0).executer() ;
		}	
	}
	
	
	/**
	 * traite toutes les taches
	 */
	public void executerToutesTaches()
	{
		while(!this.taches.isEmpty())
		{
			this.taches.remove(0).executer() ;
		}
	}

}
// fin classe GestionnaireTaches
