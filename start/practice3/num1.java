package practice3;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("�� �ڸ��� ������:");
			x= a.nextInt();		
		}
		while(x>1000||x<99);
		
		System.out.println(x);
	}

}
