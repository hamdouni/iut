package coo.observer.bh;

public class NoeudSujetObservateur extends NoeudSujet implements Observateur {
	public NoeudSujetObservateur(int n, int v, int c) {
		super(n,v,c);
	}

	public void notify(int v) {
		super.update(v);
	}
	
}
