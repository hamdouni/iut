package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique 
 * Receveur
 *
 */
public class Afficheur 
{
	
	private String message ;

	/**
	 * 
	 */
	public Afficheur() 
	{
	}
	
	
	public void setMessage(String unMessage)
	{
		this.message = unMessage ;
	}
	
	
	public void affiche()
	{
		System.out.println(this.message) ;
	}

}
// fin classe Afficheur
