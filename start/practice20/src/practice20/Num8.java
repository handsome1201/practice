package practice20;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int t = 0;
		while(a.hasNextInt()) {
		int x = a.nextInt();
		int y = a.nextInt();
		t = x+y;
		System.out.println(t);
		}
		
	}

}
