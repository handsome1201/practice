package practice19;

import java.util.Scanner;

public class num15 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		int y = a.nextInt();
		if(x>=0 && y>=0) {
			System.out.println("1");
		}
		else if(x>=0 && y<0) {
			System.out.println("4");
		}
		else if(x<0 && y>=0) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
	}

}
