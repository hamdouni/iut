package coo.command.bh;

public class EteindLampe implements Command {

	Lampe l;
	
	public EteindLampe(Lampe uneLampe) {
		l = uneLampe;
	}
	public void executer() {
		l.switchOff();
	}

}
