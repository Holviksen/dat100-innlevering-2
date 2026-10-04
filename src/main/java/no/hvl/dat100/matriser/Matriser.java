package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] i : matrise){
			for(int k : i) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String maString = "";
		for(int[] i : matrise){
			for(int k : i) {
				maString += k + " ";
			}
			maString += "\n";
		}

		return maString;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] maSkalert = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++){
			maSkalert[i] = new int[matrise[i].length]; 
			for(int k = 0; k < matrise[i].length; k++){
				maSkalert[i][k] = matrise [i][k] * tall;
			}
		}
		return maSkalert; 
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length){
			return false;
		}
		for(int i = 0; i < a.length; i++){
			if(a[i].length != b[i].length){
				return false;
			}
			for(int k = 0; k < a[i].length; k++){
				if(a[i][k] != b[i][k]){
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int n = matrise.length;
		int m = matrise[0].length;

		int[][] maSpeilet = new int[n][m];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				maSpeilet[i][j] = matrise[j][i];
			}
		}

		return maSpeilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int radA = a.length;
		int kolA = a[0].length;
		int radB = b.length;
		int kolB = b[0].length;

		if(kolA != radB){
			System.out.println("Ugyldige dimensjoner");
			return null;
		}

		int[][] maMulti = new int[radA][kolB];

		for(int i = 0; i < radA; i++){
			for(int j = 0; j < kolB; j++){
				for(int k = 0; k < radB; k++){
					maMulti[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return maMulti;
	}
}
