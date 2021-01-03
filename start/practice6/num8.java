package practice6;

import java.util.Random;
import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("¿ä¼Ò ¼ö:");
		int x= a.nextInt();
		int [] y = new int[x];
		
		for(int i=0; i<x; i++) {
			y[i]=ran.nextInt(10);
		}
		for(int i=10; i>=1; i--) {
			for(int j=0; j<x; j++) {
				if(y[i]>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();	
			}
		}
		

	}

}
