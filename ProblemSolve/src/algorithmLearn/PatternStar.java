package algorithmLearn;

import java.util.Scanner;

public class PatternStar
{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    	int n = scan.nextInt();
    	for(int row = 1; row<=n; row++) {    		
    		for(int col = n; col>=1; col--) {
    			if(col>row) {
    				System.out.print(" ");
    			} else {    				
    				System.out.print("#");
    			}
    		}
    		System.out.println();
    	}
    }
}