package practice22;

import java.util.Scanner;

public class test {

	static long sum(int a) {
		long plus = 0;
		for(int i=0; i<=a; i++) {
			plus += i;
		}
		return plus;
	}


	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int  n = scr.nextInt();
		System.out.println(sum(n));

	}

}
