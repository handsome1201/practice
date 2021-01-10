package practice11;

import java.util.Scanner;

public class num4 {
	static int linearsearch(int[] n, int key) {
		for(int i=0; i<n.length; i++) {
			if(n[i]==key) {
				return i;
			}
		}
		return -1; 
	}

	static int linearsearchr(int[] n, int key) {
		for(int i=n.length-1; i>=0; i--) {
			if(n[i]==key) {
				return i;
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("요소수: ");
		int x = a.nextInt();
		int [] n = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("x["+i+"]= ");
			n[i]=a.nextInt();
		}
		System.out.print("찾는값: ");
		int ky = a.nextInt();
		
		System.out.println("가장 앞에 위치한 값은  "+"n["+ linearsearch(n,ky)+"]"+" 에 있습니다." );
		System.out.println("가장 뒤에 위치한 값은  "+"n["+ linearsearchr(n,ky)+"]"+"에 있습니다." );
	}

}
