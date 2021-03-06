package DataStructure;

import java.util.Scanner;

public class Solution1 {


	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String result = "Hello, CCOJ";
		int cnt = scr.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.println(result);
		}
		scr.close();
	}
}
