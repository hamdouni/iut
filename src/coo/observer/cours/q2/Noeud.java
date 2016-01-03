package coo.observer.cours.q2;


public class Noeud 
{
	private String 	nom			; 		
	private int 	valeur      ;
	private int 	capacite ;

	
	/**
	 * initialise le Noeud courant avec unNom, uneValeur et unCoefficient
	 * @param uneValeur
	 * @param unCoefficient
	 */
	public Noeud(String unNom, int uneValeur, int uneCapacite) 
	{
		this.setNom(unNom);
		this.setValeur(uneValeur);
		this.setCapacite(uneCapacite);
	}


	/** recupere le nom du Noeud
	 * 
	*/
	public String getNom() 
	{
		return this.nom ;
	}
	
	/**
	 *  unNom devient le nom du Noeud
	 */
	public void setNom(String unNom)
	{
		this.nom = unNom ;
	}
	
	
	
	/** recupere la valeur du Noeud 
	 * 
	*/
	public int getValeur() 
	{
		return this.valeur ;
	}
	
	/**
	 * 
	 */
	public void setValeur(int uneValeur)
	{
		this.valeur = uneValeur ;
	}
	
	
	/**
	 * 
	 */
	public int getCapacite()
	{
		return this.capacite ;
	}
	
	/**
	 * 
	 */
	public void setCapacite(int unCoefficient)
	{
		this.capacite = unCoefficient ;
	}
	
	
	/**
	 *   retourne le String decrivant le Noeud
	 */
	public String toString()
	{
		return "(" + this.getNom() + ", "  + this.getValeur() + ", " +
			         this.getCapacite() + ")" ;
	}
	
	/**
	 * met a jour la valeur du Noeud courant en fonction de v
	 * @param v
	 */
	public void majValeur(int v)
	{
		this.setValeur(this.getValeur() + v * this.getCapacite()) ;
	}
	
}
// fin classe Noeud
