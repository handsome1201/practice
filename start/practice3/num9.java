package practice3;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int x = a.nextInt();
		
		for(int i=0; i<x; i++)
			System.out.print("*");

	}

}
