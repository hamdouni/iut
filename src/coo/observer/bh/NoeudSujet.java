package coo.observer.bh;

import java.util.ArrayList;

public class NoeudSujet extends Noeud implements Sujet {

	private ArrayList<Observateur> obs = new ArrayList<Observateur>();
	
	public NoeudSujet(int n, int v, int c) {
		super(n,v,c);
	}
	
	public void registerObserver(Observateur o) {
		this.obs.add(o);
	}

	public void unregisterObserver(Observateur o) {
		this.obs.remove(o);
	}

	public void update(int v) {
		super.update(v);
		this.notifyObserver();
	}
	
	public void notifyObserver() {
		for (Observateur o : obs) {
			o.notify(this.getValeur());
		}
	}

}
