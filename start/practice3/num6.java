package practice3;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("�� ���� ǥ���ұ��?:");
		int x = a.nextInt();
		
		int j=0;
		while(j<x) {
			if(j%2==0) {
			System.out.print("*");
			j++;
			}
			else {
			System.out.print("+");
			j++;
			}
		}
	}
}
