package practice7;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("요소 수:");
		int x = a.nextInt();
		int [] n = new int[x];
		
		for(int i=0; i<x; i++) {
			System.out.print("n["+i+"] = ");
			int y = a.nextInt();
			n[i]=y;
		}
		
		System.out.print("찾을 숫자:");
		int t = a.nextInt();
		
		int i=0;
		for(i=x-1; i>=0; i--) {
			if(n[i] == t) {
				System.out.println("n["+i+"]");			
				break;
			}
			
		}
		
		
	}

}
