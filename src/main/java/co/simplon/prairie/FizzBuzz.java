package co.simplon.prairie;

/**
 * Classe de gestion FizzBuzz gerant l'affichage d'une liste d'entiers en
 * respectant les regles suivantes : 1/ si l'entier fourni est un multiple de 3,
 * afficher la chaine de caracteres "Fizz" 2/ si l'entier fourni est un multiple
 * de 5, afficher la chaine de caracteres "Buzz" 3/ dans les autres cas, y
 * compris le zéro, afficher l'entier tel quel
 */
public class FizzBuzz {

	/**
	 * Constructeur
	 */
	public FizzBuzz() {
	}

	/**
	 * Affichage sur la sortie standard (console) de la liste des entiers entre
	 * l'index de debut et de fin, avec prise en compte des regles de
	 * substitutions fournies
	 * 
	 * @param debut
	 *            Index (entier) de debut pour l'affichage
	 * @param fin
	 *            Index (entier) de fin pour l'affichage
	 */
	public void afficherListeEntiers(int debut, int fin) {
		// code a definir pour afficher la serie de 0 a 50
		// et appeler ce code dans le main.java
		
		for (int counter = debut; counter <= fin; counter++) {
			System.out.println(determinerCorrespondance(counter));
		}
	}

	// La je determine quand afficher quoi en fonction du chiffre
	protected String determinerCorrespondance(int entier) {

		// Si le nombre est 0 alors je renvoie "0"
		if (entier == 0) {
			return "0";
		}

		// Si le nombre est multiple de 3 et de 5 alors je renvoie "FizzBuzz"
		if ((entier % 3 == 0) && (entier % 5 == 0)) {
			return "FizzBuzz";
		}

		// Sinon si l'entier est divisible par 3 je renvoie "Fizz"
		if (entier % 3 == 0) {
			return "Fizz";
		}

		// Sinon si l'entier est divisible par 5 je renvoie "Buzz"
		if (entier % 5 == 0) {
			return "Buzz";
			// Et sinon je renvoie l'entier sous forme de chaine de caractere
		}

		return Integer.toString(entier);
	}
}
