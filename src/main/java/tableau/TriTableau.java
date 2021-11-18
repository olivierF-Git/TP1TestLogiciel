package tableau;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * @author Les méthodes de tri sont issues de :
 *         http://pauillac.inria.fr/~levy/x/tc98/java/Tri.java
 *
 */
public class TriTableau {

	private static final Logger logger = Logger.getLogger(String.valueOf(TriTableau.class));
	int tableau;
	int[] array; // Le tableau à trier

	public TriTableau(String[] args) {
		tableau = args.length;
		array = new int[tableau];
		initialisation(args);
	}

	public int[] getArray() {
		return array;
	}

	public void initialisation(String[] args) {
		for (int index = 0; index < tableau; ++index)
			array[index] = Integer.parseInt(args[index]);
	}

	public void impression() {
		for (int index = 0; index < tableau; ++index) {
			logger.info("");
			for (String s : Arrays.asList(String.valueOf(array[index]), "")) {
				logger.info(s);
			}
			logger.info("");
		}
		logger.info("");
	}

	public void triSelection() {
		int min;
		int tab;
		for (int index = 0; index < tableau - 1; ++index) {
			min = index;
			for (int jindex = index + 1; jindex < tableau; ++jindex)
				if (array[jindex] < array[min])
					min = jindex;
			tab = array[min];
			array[min] = array[index];
			array[index] = tab;
		}
	}

	public void triBulle() {
		int tab;
		for (int index = tableau - 1; index >= 0; --index)
			for (int jindex = 1; jindex <= index; ++jindex)
				if (array[jindex - 1] > array[jindex]) {
					tab = array[jindex - 1];
					array[jindex - 1] = array[jindex];
					array[jindex] = tab;
				}
	}

	public void triInsertion() {
		int jindex;
		int value;
		for (int index = 1; index < tableau; ++index) {
			value = array[index];
			jindex = index;
			while (jindex > 0 && array[jindex - 1] > value) {
				array[jindex] = array[jindex - 1];
				--jindex;
			}
			array[jindex] = value;
		}
	}

	public void triShell() {
		int hauteur;
		hauteur = 1;
		do
			hauteur = 3 * hauteur + 1;
		while (hauteur <= tableau);
		do {
			hauteur = hauteur / 3;
			for (int index = hauteur; index < tableau; ++index)
				if (array[index] < array[index - hauteur]) {
					int value = array[index];
					int jindex = index;
					do {
						array[jindex] = array[jindex - hauteur];
						jindex = jindex - hauteur;
					} while (jindex >= hauteur && array[jindex - hauteur] > value);
					array[jindex] = value;
				}
		}
		while (hauteur > 1);
	}

	public void main(String[] args) {
		initialisation(args); // On lit le tableau
		impression(); // et on l'imprime
		triSelection(); // On trie
		impression(); // On imprime le résultat
		triBulle();
		impression();
		triInsertion();
		triShell();
		impression();
	}
}
