package practice19;

import java.util.Scanner;

public class num12 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		int y = a.nextInt();
		if(x>y) {
			System.out.println(">");
		}
		else if(x==y) {
			System.out.println("=");
		}
		else {
			System.out.println("<");
		}
	}

}
