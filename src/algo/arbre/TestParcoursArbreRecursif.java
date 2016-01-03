package algo.arbre;

/**
 * @author Brahim HAMDOUNI (http://brahim.hamdouni.com)
 * Parcours en profondeur d'un arbre implémenté sous forme de tableau de 4 colonnes.
 * Version récursive.
 * 
 * Tableau à 2 dimensions, ligne 0 correspond à la racine
 * col 0 : valeur stocké
 * col 1 à 3 : index des fils (maximum 3), -1 dans la colonne si pas de fils
 *
 * Exemple
 *       [5]
 *     /  |  \
 *   [9] [8] [4]
 *   / \   \ 
 * [3] [6] [7]
 *
 */

public class TestParcoursArbreRecursif {
	static int[][] T = {
		{5,  1,  2,  3},
		{9,  4,  5, -1},
		{8,  6, -1, -1},
		{4, -1, -1, -1},
		{3, -1, -1, -1},
		{6, -1, -1, -1},
		{7, -1, -1, -1}
	};
	
	public static void parcoursFils(int index) {
		int fils = 0;
		System.out.println(T[index][0]);
		for(int col=1; col<=3; col++) {
			fils = T[index][col];
			if(fils != -1) parcoursFils(fils);
		}
		
	}

	public static void main(String[] args) {
		parcoursFils(0);
	}	
}
