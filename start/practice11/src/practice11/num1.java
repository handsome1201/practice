package practice11;

import java.util.Scanner;

public class num1 {
	static int sumof(int[] n) {
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum+=n[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��Ҽ�: ");
		int x = a.nextInt();
		int [] t = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("t["+i+"] = ");
			t[i] = a.nextInt();
		}
		System.out.println("��� ����� ���� "+sumof(t)+"�Դϴ�.");

	}

}
