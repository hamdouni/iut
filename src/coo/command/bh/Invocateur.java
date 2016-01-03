package coo.command.bh;

import java.util.ArrayList;

public class Invocateur {
	private ArrayList<Command> commandes ;
	
	public Invocateur() {
		commandes = new ArrayList<Command>();
	}
	public void add(Command c) {
		commandes.add(c);
	}
	public void exec(Command c) {
		if(commandes.contains(c)) {
			c.executer();
		}
	}
}
