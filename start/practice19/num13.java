package practice19;

import java.util.Scanner;

public class num13 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		if(x<=100&&x>=90) {
			System.out.println("a");
		}
		else if(80<=x&&x<=89) {
			System.out.println("b");
		}
		else if(70<=x&&x<79) {
			System.out.println("c");
		}
		else if(60<=x&&x<69) {
			System.out.println("d");
		}
		else {
			System.out.println("f");
		}

	}

}
