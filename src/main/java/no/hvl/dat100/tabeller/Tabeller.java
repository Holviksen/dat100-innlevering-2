package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int i : tabell){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tabellString = "[";
		for(int i : tabell){
			tabellString += i + ",";
		}
		if(tabell.length == 0){
			return "[]";
		}
		tabellString = tabellString.substring(0, tabellString.length() - 1) + "]";

		return tabellString;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i : tabell){
			sum += i;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int i : tabell){
			if(i == tall){
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for(int i = 0; i < tabell.length; i++){
			if(tabell[i] == tall){
				pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
		for(int i = tabell.length - 1, k = 0; i >= 0; i--, k++){
			reversert[k] = tabell[i];
		}
		return  reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if(tabell.length == 0){
			return true;
		}

		for(int i = 1; i < tabell.length; i++){
			if(tabell[i] < tabell[i - 1]){
				return false;
			}
		}

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for(int i = 0; i < tabell1.length; i++){
			nyTabell[i] = tabell1[i];
		}

		for(int i = tabell1.length, k = 0; i < nyTabell.length; i++, k++){
			nyTabell[i] = tabell2[k];
		}

		return nyTabell;
	}
}
