package practice13;

import java.util.Scanner;

public class num1 {
	static int[][] aryclone2(int[][] n){
		int [][] t = new int[n.length][];
		for(int i=0; i<n.length; i++) {
			t[i]= new int[n[i].length];
			for(int j=0; j<n[i].length; j++) {
				t[i][j]=n[i][j];
			}
		}

		return t;	
	}

	static void print(int [][] t) {
		for(int i=0; i<t.length; i++) {
			System.out.println();
			for(int j=0; j<t[i].length; j++) {
				System.out.print(t[i][j]+ " ");
			}
		}
	}


	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("행렬의 행 수: ");
		int h = a.nextInt();
		System.out.print("행렬의 열 수: ");
		int w = a.nextInt();
		int [][] x = new int[h][w];

		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print("x["+i+"]["+j+"]= ");
				x[i][j]=a.nextInt();

			}
		}
		
		int[][] ca=aryclone2(x);
		System.out.println("행렬 a");
		print(x);
		System.out.println();
		System.out.println("복사본");
		print(ca);
	}

}
