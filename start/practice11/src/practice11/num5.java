package practice11;

import java.util.Scanner;

public class num5 {

	static void aryrmv(int []n, int idx) {
		for(int i=0; i<n.length; i++ ) {
			if(i==idx) {
				n[i]=n[i+1];
			}
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("요소수: ");
		int x = a.nextInt();
		int [] n = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("n["+i+"]= ");
			n[i] =a.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스: ");
		int idx = a.nextInt();

		aryrmv(n,idx);
		for(int i=0; i<x; i++) {
			System.out.println("n["+i+"]= "+n[i]);
		}
	}

}
