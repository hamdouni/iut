package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique
 *
 */
public class CommandeResoudEquation2 implements Commande 
{

	Equation2 equation  ;
	
	/**
	 * 
	 */
	public CommandeResoudEquation2(Equation2 uneEquation) 
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
