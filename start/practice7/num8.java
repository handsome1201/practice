package practice7;

import java.util.Random;
import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("¿ä¼Ò ¼ö:");
		int x= a.nextInt();
		int [] n = new int[x];
		
		for(int i=0; i<x; i++) {
			n[i]=1+ran.nextInt(9);
		}
		for(int i=0; i<x; i++) {
			System.out.println("n["+i+"] = "+n[i]);
		}
	}

}
