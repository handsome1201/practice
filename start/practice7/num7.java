package practice7;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("¿ä¼Ò ¼ö:");
		int x = a.nextInt();
		double [] n = new double[x];
		
		for(int i=0; i<x; i++) {
		System.out.print("n["+i+"] = ");
		int y = a.nextInt();
		n[i]=y;
		}
		
		double sum = 0;
		for(int i=0; i<x; i++) {
		sum+=n[i];
		}
		System.out.println(sum);
		System.out.println(sum/x);
	
	
	}
}
