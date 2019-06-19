package algorithmLearn;

import java.util.Scanner;

public class DiagonalDifference {
	private static Scanner scan = new Scanner(System.in);
	public static int difference(int arr[][], int n) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				// finding sum of primary diagonal
				if (row == col)
					d1 += arr[row][col];

				// finding sum of secondary diagonal
				if (row == n - col - 1)
					d2 += arr[row][col];
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
