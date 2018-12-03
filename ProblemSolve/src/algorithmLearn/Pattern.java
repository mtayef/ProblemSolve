package algorithmLearn;

import java.io.*;

public class Pattern {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		int no = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= no; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int j = 1; j<=no-2;j++) {
			for(int i = 1; i<=no;i++) {
				if(i==1 || i==no) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i<=no;i++) {
			System.out.print("*");
		}
	}

}