package coo.observer.bh;

public abstract class Noeud {
	private int nom, valeur, capacite;
	
	public Noeud() {}
	public Noeud(int n, int v, int c) {
		this.setNom(n);
		this.setValeur(v);
		this.setCapacite(c);
	}
	public void update(int v) {
		this.setValeur(this.getValeur() + v * this.getCapacite());
	}
	public int getNom() {
		return nom;
	}
	public void setNom(int n) {
		this.nom = n;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int v) {
		this.valeur = v;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int c) {
		this.capacite = c;
	}
	public String toString() {
		return "nom = " + nom + " valeur = " + valeur + " capacite = " + capacite;
	}
}
