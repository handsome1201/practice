package practice4;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("�������� ǥ���մϴ�.");
		System.out.println("�ܼ���?:");
		int x = a.nextInt();
		
		for(int i = 1; i<=x; i++) {
			for(int j = 1; j<=x; j++) {
				System.out.print("*");
			}
		System.out.println();	
		}		
	}

}
