package practice3;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("ī��Ʈ�ٿ� �մϴ�");
		int x;
		
		do {
			System.out.println("����������:");
			x = a.nextInt();	
		}
		while(x<0);
	
		System.out.println(x);
		do {
		x=x-1;
		System.out.println(x);
		}
		while(x>0);
	}
}
