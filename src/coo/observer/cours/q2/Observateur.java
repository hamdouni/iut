package coo.observer.cours.q2;

/**
 * 
 */

/**
 * @author dominique
 * gere un Observateur dans le cadre de design pattern Observateur
 */
public interface Observateur 
{
	/** actualise la valeur de l'Observateur
	 * 
	 * @param valeur
	 */
	public abstract void actualiser(int uneValeur) ;
}
// fin interface Observateur
