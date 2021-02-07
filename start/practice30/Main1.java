package practice30;

import java.util.Scanner;

public class Main1 {

	static void stardraw(int x) {
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("´Ü¼ö´Â: ");
		int star= a.nextInt();
		stardraw(star);
		a.close();
	}

}
