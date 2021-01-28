package practice23;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("고정 비용: ");
		int  x= a.nextInt();
		System.out.print("가변 비용: ");
		int y = a.nextInt();
		System.out.print("판매 비용: ");
		int z = a.nextInt();
		
		int count=0;
		
		while(x+(count*y)-(count*z)>=0) {
			count++;
		}
		System.out.println(count);
	}

}
