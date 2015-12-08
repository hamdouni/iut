package arbre;

import java.util.* ;

/**
 * @author Brahim HAMDOUNI (http://brahim.hamdouni.com)
 * Parcours en profondeur d'un arbre implémenté sous forme de tableau de 4 colonnes
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

public class TestParcoursArbre {

	public static void main(String[] args) {
		int[][] T = {
			{5,  1,  2,  3},
			{9,  4,  5, -1},
			{8,  6, -1, -1},
			{4, -1, -1, -1},
			{3, -1, -1, -1},
			{6, -1, -1, -1},
			{7, -1, -1, -1}
		};

		Stack<Info> pile = new Stack<Info> ();

		pile.push(new Info(0,1));

		Info current = null;
		int idxFils = 0;

		while (! pile.empty()) {
			current = pile.pop();

			//if (current.col == 1) System.out.println(T[current.idx][0]);	// c'est la première colonne de notre noeud, 
											// donc c'est la 1ere fois qu'on passe sur ce noeud, 
											// on affiche sa valeur

			System.out.println(T[current.idx][0]);				// version L. Finta

			idxFils = T[current.idx][current.col]; 				// on regarde l'index du noeud fils en cours
			if (idxFils != -1) {	
				if(current.col < 3) {					 					
					current.col ++;					// on prépare le prochain traitement à la colonne suivante
					pile.push(current);				// (sauf si on est deja à la dernière)
				}
				pile.push(new Info(idxFils,1));
			}
		}
	}	
}
