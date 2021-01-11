package practice12;

import java.util.Scanner;

public class num6 {

	static int[][] addmatrix(int[][] x, int[][] y){
		int[][] z = new int[x.length][];
		for(int i=0; i<x.length; i++) {
			z[i]=new int[x[i].length];
			for(int j=0; j<x[i].length; j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}

		return z;
	}


	static void print(int [][] m) {
		for(int i=0; i<m.length; i++) {
			System.out.println();
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
		}
	}


	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("����� �� ��: ");
		int h = a.nextInt();
		System.out.print("����� �� ��: ");
		int w = a.nextInt();
		int [][] x = new int[h][w];
		int [][] y = new int[h][w];

		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print("x["+i+"]["+j+"]= ");
				x[i][j]=a.nextInt();
			}
		}
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				System.out.print("y["+i+"]["+j+"]= ");
				y[i][j]=a.nextInt();
			}
		}
		System.out.println("��� a");
		print(x);
		System.out.println();
		System.out.println();
		System.out.println("��� b");
		print(y);
		System.out.println();
		System.out.println();

		int [][] c = addmatrix(x,y);
		System.out.println("��� c");
		print(c);

	}

}
