package practice9;

import java.util.Scanner;

public class num4 {
	
	static int sumup(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("1���� x������ ���� ������.");
		System.out.print("x�� ��: ");
		int n = a.nextInt();
		System.out.println("1���� "+n+"������ ���� "+sumup(n)+"�Դϴ�.");
	}

}
