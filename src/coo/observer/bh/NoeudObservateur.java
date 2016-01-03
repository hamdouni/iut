package coo.observer.bh;

public class NoeudObservateur extends Noeud implements Observateur {
	public NoeudObservateur(int n, int v, int c) {
		super(n,v,c);
	}
	public void notify(int v) {
		super.update(v);
	}
}
