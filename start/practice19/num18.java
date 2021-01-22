package practice19;

import java.util.Scanner;

public class num18 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		for(int i=0; i<n; i++) {
			int x = a.nextInt();
			int y = a.nextInt();
			System.out.print(x+y);
		}
	}

}
