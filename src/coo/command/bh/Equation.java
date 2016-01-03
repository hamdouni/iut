package coo.command.bh;

public class Equation {
	double a,b,c,d,r1,r2,n;
	
	public Equation(double aa, double ab, double ac) {
		a = aa;
		b = ab;
		c = ac;
	}
	
	public void solve() {
		d = b*b - 4*a*c; 					// déterminant
		if(d<0) n = 0; 						// pas de racine réelle
		else if (d==0) { 					// 1 racine double
			n = 1;
			r1 = (-b - Math.sqrt(d))/(2*a);	
		} else {		 					// 2 racines
			n = 2;
			r1 = (-b - Math.sqrt(d))/(2*a);	
			r2 = (-b + Math.sqrt(d))/(2*a);
		}
	}
	public String toString() {
		return a + ".x^2 + "+ b + ".x + " + c;
	}
	public String solutions() {
		String res = "";
		if(n==0) res = "no solution";
		else if(n==1) res="1 solution " + r1;
		else res="2 solutions " + r1 + " " + r2;
		return res;
	}
}
