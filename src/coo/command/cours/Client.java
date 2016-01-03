package coo.command.cours;

/**
 * 
 */

/**
 * @author dominique
 *
 */ 
public class Client 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
												// 1) on cree l'invocateur
			GestionnaireTaches g = new GestionnaireTaches() ;
													
												// 2) on cree les receveurs
			Afficheur a = new Afficheur() ;
			Equation2 e = new Equation2()  ;
			
												// 3) on cree les Commandes
			Commande c1 = new CommandeAfficherBonjour(a)   ;
			Commande c2 = new CommandeAfficherAuRevoir(a)  ;
			Commande c3 = new CommandeResoudreEquation2(e) ;
			
												// 4) on enregistre les commandes
												//    dans l'invocateur
			g.ajouterTache(c1) ;
			g.ajouterTache(c2) ;
			g.ajouterTache(c3) ;
												// 5) on active les commandes 
												//    enregistrees
			g.executerLaTache(c1) ;
			g.executerLaTache(c2) ;
			g.executerLaTache(c3) ;
			
	}

}
// fin classe Client
