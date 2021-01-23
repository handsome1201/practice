package practice21;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		int []n = new int[x];
		for(int i=0; i<x; i++) {
			System.out.println("값: ");
			int y = a.nextInt();
			n[i] = y;
		}
		int t = n[0];
		for(int i=1; i<x; i++) {
			if(t>n[i]) {
				t=n[i];
				
			}
		}
		int p=n[0];
		for(int i=1; i<x; i++) {
			if(p<n[i]) {
				p=n[i];
			}
		}
		System.out.println(t+" "+p);
	}

}
