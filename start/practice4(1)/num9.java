package practice4;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("정뱡향을 표시합니다.");
		System.out.println("단수는?:");
		int x = a.nextInt();
		
		for(int i = 1; i<=x; i++) {
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
		System.out.println();	
		}		
	}

}
