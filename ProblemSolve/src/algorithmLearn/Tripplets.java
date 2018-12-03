package algorithmLearn;

import java.util.Scanner;

public class Tripplets {
	
	private static final int count = 3;
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[count];
		int b[] = new int[count];
		for(int i = 0; i<count; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0; i<count; i++) {
			b[i] = scan.nextInt();
		}
		int aPoints = 0;
		int bPoints = 0;
		for (int i = 0; i<count; i++) {
			if(a[i]>b[i]) {
				aPoints++;
			} else if(a[i]<b[i]) {
				bPoints++;
			}
		}
		
		System.out.println(aPoints+" "+bPoints);
	}

}
