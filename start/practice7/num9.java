package practice7;

import java.util.Random;
import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("¿ä¼Ò ¼ö:");
		int x= a.nextInt();
		int [] n = new int[x];
		
		for(int i=0; i<x; i++) {
			int j;
			do {
				j=0;
				n[i]=1+ran.nextInt(10);
				for(;j<i;j++)
					if(n[i]==n[j])
					break;	
			}while(j<i);
		}
		for(int i=0; i<x; i++) {
			System.out.println("n["+i+"] = "+n[i]);
		}
	}

}
