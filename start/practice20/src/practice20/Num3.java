package practice20;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		int [] n = new int[x];
		int [] m = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("입력하세요: ");
			int y = a.nextInt();
			n[i]=y;
			int z = a.nextInt();
			m[i]=z;
		}
		
		for(int i=0; i<x; i++) {
			System.out.println("case #"+(i+1)+": "+n[i]+" + "+m[i]+" = "+(n[i]+m[i]));
		}
	}

}
