package practice13;

import java.util.Scanner;

public class num4 {
	static void printarray(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
	}

	static void printarray(int[][] m) {
		for(int i=0; i<m.length; i++) {
			System.out.println();
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("1���� ��� x�� ��Ҽ�: ");
		int x = a.nextInt();
		int [] q = new int[x];
		for(int i=0; i<q.length; i++) {
			System.out.print("x["+i+"]= ");
			q[i]=a.nextInt();
		}
		System.out.print("2���� ��� y�� �� ��: ");
		int h = a.nextInt();
		int [][] p = new int[h][];
		for(int i=0; i<p.length; i++) {
			System.out.print(i+"��° �� ��: ");
			int w = a.nextInt();
			p[i]=new int[w];

		}
		System.out.print("�� ����� ���� �Է�����.");

		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p[i].length; j++) {
				System.out.print("p["+i+"]["+j+"]= ");
				p[i][j]=a.nextInt();
			}
		}
		System.out.println("1���� �迭 x");
		System.out.println();
		printarray(q);
		System.out.println();
		System.out.println("2���� �迭 y");
		System.out.println();
		printarray(p);
	}

}
