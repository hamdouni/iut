package coo.observer.cours.q2;

/**
 * @author dominique
 * gere un sujet dans le cadre du design pattern Observateur
 */
public interface Sujet 
{
	public abstract void enregistrerObservateur(Observateur o) ;
	
	public abstract void supprimerObservateur(Observateur o) ;
	
	public abstract void notifierObservateurs() ;
}
// fin interface Sujet
