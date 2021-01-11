package practice12;

import java.util.Scanner;

public class num3 {
	static int[] arrayinsof(int [] n, int idx, int in) {
		if(idx > n.length || idx < 0 ) {
			return n.clone();
		}
		else {
			int [] c = new int[n.length+1];
			for(int i=0; i<idx+1; i++) {
				c[i]=n[i];
			}

			for(int i=idx+1; i<n.length+1; i++) {
				c[i]=n[i-1];
			}
			c[idx]=in;
			return c;
		}

	}
	public static void main(String[] args) {

		Scanner a  = new Scanner(System.in);
		System.out.print("¿ä¼Ò¼ö: ");
		int x = a.nextInt();
		int [] n = new int[x];

		for(int i=0; i<x; i++) {
			System.out.print("x["+ i + "]= ");
			n[i]=a.nextInt();
		}

		System.out.print("»ðÀÔÇÒ ÀÎµ¦½º: ");
		int idx = a.nextInt();

		System.out.print("»ðÀÔÇÒ °ª: ");
		int in = a.nextInt();

		int [] t =  arrayinsof(n, idx, in);

		for(int i=0;i< t.length; i++ ) {
			System.out.println("x["+ i + "]= "+t[i]);
		}
	}

}
