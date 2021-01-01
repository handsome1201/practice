package practice4;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("1부터 n의값의 합을 구합니다");
		System.out.println("n의 값:");
		int x =a.nextInt();
		int sum=0;
		
		for(int i=1; i<x; i++) {
			System.out.print(i+"+");
			sum += i;
		}
		System.out.print(x+"=");
		sum+=x;
		System.out.print(sum);
	}

}
