package practice19;

import java.util.Scanner;

public class num11 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		int y = a.nextInt();
		int z = (y%10)*x;
		int c = (((y%100)-(y%10))/10)*x;
		int v = (y/100)*x;
		int b = x*y;
		System.out.println(z);
		System.out.println(c);
		System.out.println(v);
		System.out.println(b);
	}

}
