package practice3;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("카운트다운 합니다");
		int x;
		
		do {
			System.out.println("양의정숫값:");
			x = a.nextInt();	
		}
		while(x<0);
	
		System.out.println(x);
		do {
		x=x-1;
		System.out.println(x);
		}
		while(x>0);
	}
}
