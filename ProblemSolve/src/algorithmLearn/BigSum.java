package algorithmLearn;

import java.util.Scanner;

public class BigSum {
	
	private static Scanner scan = new Scanner(System.in);
	private static int count = scan.nextInt();
	static long aVeryBigSum(long nums[]) {
		long sumResult = 0;
		for(int i =0; i<count; i++) {
			nums[i] = scan.nextLong();
			sumResult +=nums[i];
		}		
		return sumResult;
	}
	
	public static void main(String args[]) {
		long nums[] = new long [count];		
		System.out.println(aVeryBigSum(nums));
	}
}
