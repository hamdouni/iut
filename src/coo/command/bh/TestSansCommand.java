package coo.command.bh;

import java.util.Scanner;

public class TestSansCommand {
	public static void executeEquation(Equation e) {
		e.solve();
		System.out.println(e + "=>" + e.solutions());
	}
	public static void executeAllumer(Lampe l) {
		l.switchOn();
	}
	public static void executeEteindre(Lampe l) {
		l.switchOff();
	}
	
	public static void main(String[] args) {
		boolean sortie = false;
		String key = "";
		Scanner in = new Scanner(System.in);
		
		Equation e = new Equation(2.0,-36.0,12.0);
		Lampe l = new Lampe();
		
		while(!sortie) {
			System.out.println("0 --> exit");
			System.out.println("1 -> Equation");
			System.out.println("2 -> Allumer");
			System.out.println("3 -> Eteindre");
			key = in.nextLine();
			switch(key) {
				case "0": sortie = true; break;
				case "1": executeEquation(e); break;
				case "2": executeAllumer(l); break;
				case "3": executeEteindre(l); break;
			}
		}	
		
		in.close();
	}
}
