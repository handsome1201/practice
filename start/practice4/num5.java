

package practice4;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("몇 개의  *을 표시할까요:");
		int x = a.nextInt();
		
		for(int i=0; i<x; i++) {
			System.out.print("*");
			if(i%5==4) {
				System.out.println();
			}
		}
	}

}
