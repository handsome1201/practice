package practice4;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("1���� n�ǰ��� ���� ���մϴ�");
		System.out.println("n�� ��:");
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
