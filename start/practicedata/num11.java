package practicedata;

import java.util.Scanner;

class calculator1 implements calculatable{
	private int x,y,z;
	public static int plus(int x, int y, int z) {
		return x+y+z;
	}
	public static int subtraction(int x, int y, int z) {
		return x-y-z;
	}
}


public class num11 {


	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x = scr.nextInt();
		int y = scr.nextInt();
		int z = scr.nextInt();

		calculator1 c = new calculator1();

		System.out.println(c.plus(x,y,z));
		System.out.println(c.subtraction(x,y,z));
		scr.close();
	}
}
