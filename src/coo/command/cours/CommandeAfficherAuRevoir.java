package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique
 *
 */
public class CommandeAfficherAuRevoir implements Commande
{
	
	private Afficheur afficheur ;

	/**
	 * 
	 */
	public CommandeAfficherAuRevoir(Afficheur unAfficheur) 
	{
		this.afficheur = unAfficheur ;
	}
	
	/**
	 * 
	 */
	public void executer()
	{
		this.afficheur.setMessage("au revoir");
		this.afficheur.affiche() ;
	}
	
	public void annuler()
	{
		
	}

}
