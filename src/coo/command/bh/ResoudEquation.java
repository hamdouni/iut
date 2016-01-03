package coo.command.bh;

public class ResoudEquation implements Command {
	
	Equation e;

	public ResoudEquation(Equation uneEquation) {
		e = uneEquation;
	}
	public void executer() {
		e.solve();
		System.out.println(e + "=>" + e.solutions());
	}

}
