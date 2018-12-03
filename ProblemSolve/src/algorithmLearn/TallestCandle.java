package algorithmLearn;
import java.util.Scanner;

public class TallestCandle {
	private static final Scanner scan = new Scanner(System.in);
	private static int tallCandle(int n) {
		int age[] = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			age[i] = scan.nextInt();
		}
		int tall = 0;
		for (int i = 0; i < n; i++) {
			if (age[i] > max) {
				max = age[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if(age[i] == max) {
				tall ++;
			}
		}
		return tall;
	}

	public static void main(String args[]) {
		int n = scan.nextInt();
		System.out.println(tallCandle(n));
	}
}
