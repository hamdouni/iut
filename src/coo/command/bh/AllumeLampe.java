package coo.command.bh;

public class AllumeLampe implements Command {
	
	Lampe l;
	
	public AllumeLampe(Lampe uneLampe) {
		l = uneLampe;
	}

	public void executer() {
		l.switchOn();
	}

}
