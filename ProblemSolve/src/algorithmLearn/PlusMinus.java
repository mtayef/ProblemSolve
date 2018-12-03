package algorithmLearn;

import java.util.Scanner;

public class PlusMinus {
	private static Scanner scan = new Scanner(System.in);
	public static String plusMinus(int arr[], int n) {
		int positive = 0, negative = 0, zero = 0; 
		double posFraction = 0, negFraction = 0, zeroFraction = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
			if(arr[i]>0) {
				positive++;
			} else if (arr[i]<0) {
				negative++;
			} else {
				zero++;
			}			
		}
		posFraction = (double)positive/n;
		negFraction = (double)negative/n;
		zeroFraction = (double)zero/n;
		
		return String.format("%.06f\n%.06f\n%.06f",posFraction, negFraction, zeroFraction);
	}

	public static void main(String[] args) {
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println(plusMinus(arr, n));
	}
}