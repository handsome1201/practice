package practice3;

import java.util.Scanner;

public class num3 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("정수a:");
		int x = a.nextInt();
		System.out.println("정수b:");
		int y = a.nextInt();
		if(x>y) {
			int b = x;
			x=y;
			y=b;
		}
		
		do {
			System.out.println(x);
			x=x+1;
		}
		while(x<y+1);
		System.out.println();
	}
}
