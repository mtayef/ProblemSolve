package algorithmLearn;

import java.util.Scanner;

public class SecondAlgorithm {
	
	static int arrSum(int [] nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}
	
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int count = scan.nextInt();
		int nums[] = new int[count];
		
		for(int i = 0; i<count; i++) {
			nums[i] = scan.nextInt();
		}
		
		System.out.println(arrSum(nums));
	}

}
