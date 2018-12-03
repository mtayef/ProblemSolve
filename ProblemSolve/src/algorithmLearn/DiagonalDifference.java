package algorithmLearn;

import java.util.Scanner;

public class DiagonalDifference {
	private static Scanner scan = new Scanner(System.in);
	public static int difference(int arr[][], int n) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int col = 0; col < n; col++) {
			for (int row = 0; row < n; row++) {
				// finding sum of primary diagonal
				if (col == row)
					d1 += arr[col][row];

				// finding sum of secondary diagonal
				if (col == n - row - 1)
					d2 += arr[col][row];
			}
		}

		// Absolute difference of the sums
		// across the diagonals
		return Math.abs(d1 - d2);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int n = scan.nextInt();

		int arr[][] = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.print(difference(arr, n));
	}
}