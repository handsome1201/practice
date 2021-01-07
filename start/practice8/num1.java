package practice8;

import java.util.Random;
import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("요소 수:");
		int x = a.nextInt();
		int [] n = new int[x];
		
		for(int i=0; i<x; i++) {
			n[i]=ran.nextInt(100);
			System.out.println("a["+i+"]= "+n[i]);
		}
		System.out.println("요소를 섞었습니다.");
		
		for(int i=x; i>0;i--) {
			int j =ran.nextInt(i+1);
			if(i !=j) {
				int t=n[i];
				n[i]=n[j];
				n[j]=t;
			}
		System.out.println("a["+(x-i)+"]= "+n[(x-i)]);	
		}
	}

}
