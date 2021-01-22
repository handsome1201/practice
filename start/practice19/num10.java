package practice19;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		int y = a.nextInt();
		int z = a.nextInt();
		System.out.println( (x+y)%z);
		System.out.println( ((x%z) + (y%z))%z);
		System.out.println((x*y)%z);
		System.out.println(((x%z) * (y%z))%z);
	}

}
