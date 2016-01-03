package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique
 *
 */
public class CommandeResoudreEquation2 implements Commande 
{

	Equation2 equation  ;
	
	/**
	 * 
	 */
	public CommandeResoudreEquation2(Equation2 uneEquation) 
	{
		this.equation = uneEquation ;
	}
	
	
	/**
	 * Definit la requete a executer
	 */
	public void executer()
	{
		equation.init() ;
		equation.calculeDeterminant() ;
		equation.calculeRacines();
		equation.afficheSolutions() ;
	}

}
