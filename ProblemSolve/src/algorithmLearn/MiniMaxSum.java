package algorithmLearn;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
        long[] a = new long[5];
        long sum = 0;
        
        for (int i = 0 ; i < a.length ; i++){
            long temp = scan.nextLong();
            a[i] = temp;
            sum += temp;
        }
    
        Arrays.sort(a);
        System.out.println((sum - a[a.length-1]) + " " + (sum - a[0]));
	}
}
