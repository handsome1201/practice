package practice5;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.println("단수는?:");
		int x = a.nextInt();
		
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=(x-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
