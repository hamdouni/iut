package coo.command.bh;

import java.util.Scanner;

public class TestCommand {
	
	public static void main(String[] args) {
		boolean sortie = false;
		String key = "";
		Scanner in = new Scanner(System.in);

		Invocateur invoker = new Invocateur();

		Equation e = new Equation(2.0,-36.0,12.0);
		Lampe l = new Lampe();
		
		Command cmd1 = new ResoudEquation(e);
		Command cmd2 = new AllumeLampe(l);
		Command cmd3 = new EteindLampe(l);
		invoker.add(cmd1);
		invoker.add(cmd2);
		invoker.add(cmd3);
		
		while(!sortie) {
			System.out.println("0 --> exit");
			System.out.println("1 -> Equation");
			System.out.println("2 -> Allumer");
			System.out.println("3 -> Eteindre");
			key = in.nextLine();
			switch(key) {
				case "0": sortie = true; break;
				case "1": invoker.exec(cmd1); break;
				case "2": invoker.exec(cmd2); break;
				case "3": invoker.exec(cmd3); break;
			}
		}	
		
		in.close();
	}

}
