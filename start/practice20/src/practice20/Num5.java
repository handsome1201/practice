package practice20;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		for(int i=1; i<x+1; i++) {
			for(int j=1; j<=x-i; j++) {
				System.out.print(" ");		
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}