package practice4;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("�������� ǥ���մϴ�.");
		System.out.println("�ܼ���?:");
		int x = a.nextInt();
		
		for(int i = 1; i<=x; i++) {
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
		System.out.println();	
		}		
	}

}
