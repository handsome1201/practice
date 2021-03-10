package practicedata;

import java.util.Scanner;

class calculator{
		private int x,y,z;
		public static int plus(int x, int y, int z) {
			return x+y+z;
		}
		public static int subtraction(int x, int y, int z) {
			return x-y-z;
		}
	}

	
public class num10 {

	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int x = scr.nextInt();
		int y = scr.nextInt();
		int z = scr.nextInt();
		
		
		
		System.out.println(calculator.plus(x,y,z));
		System.out.println(calculator.subtraction(x,y,z));
		scr.close();
	}
}
