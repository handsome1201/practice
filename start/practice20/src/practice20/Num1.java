package practice20;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		for(int i=x; i>0; i--) {
			System.out.println(i);
		}

	}

}
