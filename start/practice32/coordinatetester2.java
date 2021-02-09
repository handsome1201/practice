package practice32;

import java.util.Arrays;
import java.util.Scanner;

public class coordinatetester2 {

	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);
		System.out.print("ÁÂÇ¥ °¹¼ö: ");
		int n = stdn.nextInt();

		Coordinate[] a = new Coordinate[n];
		
		for(int i=0; i<a.length; i++) {
			a[i]=new Coordinate(5.5,7.7);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(Arrays.toString(a));
		}

	}

}
