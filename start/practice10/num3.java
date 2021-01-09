package practice10;

import java.util.Scanner;

public class num3 {
	static Scanner a = new Scanner(System.in);
	
	static int readplus() {
		int x;
		do {
			System.out.print("양의 정숫값: ");
			x = a.nextInt();
		}
		while(x<=0);
		return x;
	}
	
	public static void main(String[] args) {
		int n =readplus();
		System.out.print("반대로 읽으면 ");
		while(n>0) {
			System.out.print(n%10);
			n=n/10;
			}
		System.out.println("입니다");	
		
	}
}