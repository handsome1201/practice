package practice10;

import java.util.Scanner;

public class num1 {
	static void putchars(String string,int n) {
		while(n-->0) {
			System.out.print(string);
		}
	}
	static void putstart(int n) {
		putchars("*",n);
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���: ");
		int n = a.nextInt();
		for(int i=1; i<n+1;i++) {
			putstart(i);
			System.out.println();
		}
			

	}

}
