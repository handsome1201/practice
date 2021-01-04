package practice7;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("¿ä¼Ò ¼ö:");
		int x= a.nextInt();
		int [] n= new int[x];
		
		for(int i=0; i<x; i++) {
			System.out.print("x["+i+"] = ");
			int y = a.nextInt();
			n[i]=y;
		}	
		for(int i=0; i<x; i++) {
		System.out.print(n[i]);
		}
	}

}
