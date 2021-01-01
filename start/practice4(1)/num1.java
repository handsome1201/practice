package practice4;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("카운트업 합니다.");
		System.out.println("양의 정수값:");
		int x = a.nextInt();
		
		for(int i=0; i<=x; i++)
			System.out.println(i);
	}

}
