package coo.command.bh;

public class Lampe {
	private boolean allumee = false;
	
	public boolean isOn() {
		return allumee;
	}
	public void switchOn() {
		allumee = true;
		System.out.println("Lampe : " + this);
	}
	public void switchOff() {
		allumee = false;
		System.out.println("Lampe : " + this);
	}
	public String toString() {
		String res = "";
		if(allumee) res = "ON";
		else res = "OFF";
		return res;
	}
}
