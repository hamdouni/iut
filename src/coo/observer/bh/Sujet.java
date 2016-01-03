package coo.observer.bh;

public interface Sujet {
	public abstract void registerObserver(Observateur o);
	public abstract void unregisterObserver(Observateur o);
	public abstract void notifyObserver();	
}
