package practice4;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("몇cm부터:");
		int x = a.nextInt();
		System.out.println("몇cm까지:");
		int y = a.nextInt();
		System.out.println("몇 cm단위까지:");
		int z = a.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("----------");
		
		for(int i=x; i<=y; i+=z) {
			System.out.println(i+"  "+ 0.9*(i-100));
		}
	}
	

}
