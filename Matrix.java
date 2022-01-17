package ds;

/* WHAT IS A MATRIX?
 * A matrix is basically a 2D array
 */

public class Matrix {
	public static void main (String [] args) {
		int arr [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
			
	}
}
