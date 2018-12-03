package algorithmLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
	
	private static final int count = 3;
	private static final Scanner scan = new Scanner(System.in);
	
	static String compareTriplets(List<Integer> a, List<Integer> b) {		
		for(int i = 0; i<count; i++) {
			a.add(scan.nextInt());
		}
		for(int i = 0; i<count; i++) {
			b.add(scan.nextInt());
		}
		
		int aPoints = 0;
		int bPoints = 0;
		
		for(int i = 0; i<count; i++) {
			if(a.get(i)>b.get(i)) {
				aPoints++;
			} else if(a.get(i)<b.get(i)) {
				bPoints++;
			}
		}
		return aPoints+" "+bPoints;
    }
	
	public static void main(String[] args) {
		List <Integer> a = new ArrayList<Integer>();
		List <Integer> b = new ArrayList<Integer>();
		System.out.println(compareTriplets(a, b));
	}

}
