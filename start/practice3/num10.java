package practice3;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		System.out.println("양의 정수값:");
		int x = a.nextInt();
		
		for(; x>0; x--)
				System.out.println(x);
	
	}	
}
