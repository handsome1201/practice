package practice11;

import java.util.Scanner;

public class num3 {
	static int minof(int[] n) {
		int p=0;
		for(int i=0; i<n.length; i++) {
			p=n[0];
			if(p>n[i]) {
				p=n[i];
			}
		}
		return p;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��� ����: ");
		int x = a.nextInt();
		System.out.println("4���� ����� ü���� �Է�����.");
		int [] min = new int[x];
		int [] max = new int[x];

		for(int i=0; i<x; i++) {
			System.out.print((i+1)+"���� ����: ");
			min[i]=a.nextInt();
			System.out.print((i+1)+"���� ü��: ");
			max[i]=a.nextInt();
		}


		System.out.println("���� Ű�� ���� ����� ����:"+ minof(min)+"cm");
		System.out.println("���� ���� ����� ü��: "+ minof(max)+"kg");



	}

}
