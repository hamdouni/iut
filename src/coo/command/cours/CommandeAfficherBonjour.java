package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique
 *
 */
public class CommandeAfficherBonjour implements Commande
{
	
	private Afficheur afficheur ;

	/**
	 * 
	 */
	public CommandeAfficherBonjour(Afficheur unAfficheur) 
	{
		this.afficheur = unAfficheur ;
	}
	
	/**
	 * 
	 */
	public void executer()
	{
		this.afficheur.setMessage("bonjour");
		this.afficheur.affiche() ;
	}
	
	public void annuler()
	{
		
	}

}
