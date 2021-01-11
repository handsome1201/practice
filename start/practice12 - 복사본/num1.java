package practice12;

import java.util.Scanner;

public class num1 {
	static int[] arrayrmvofn(int [] n, int idx, int del) {

		if(idx>n.length || del>n.length || idx<0) {
			return n.clone();
		}
		else {
			int [] c = new int[n.length-del];
			for(int i=0;i<idx;i++) {
				c[i]=n[i];
			}
			for(int i = idx; i<n.length-del; i++) {
				c[i] = n[i+del];
			}
			return c;
		}

	}
	public static void main(String[] args) {
		Scanner a  = new Scanner(System.in);
		System.out.print("요소수: ");
		int x = a.nextInt();
		int [] n = new int[x];

		for(int i=0; i<x; i++) {
			System.out.print("x["+ i + "]= ");
			n[i]=a.nextInt();
		}

		System.out.print("삭제를 시작할 인덱스: ");
		int idx = a.nextInt();

		System.out.print("삭제할 요소의 개수: ");
		int del = a.nextInt();

		int [] t = arrayrmvofn(n,idx,del);
		
		for(int i=0;i< t.length; i++ ) {
			System.out.println("x["+ i + "]= "+t[i]);
		}

	}



}
