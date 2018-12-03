package algorithmLearn;

import java.util.Scanner;

public class DiagonalDifference2 {
	private static Scanner scan = new Scanner(System.in);
	public static int difference(int arr[][], int n) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
			d2 += arr[n-1-i][i];
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