package practice9;

import java.util.Scanner;

public class num6 {
	static void season(int m) {
		switch(m) {
		case 3: case 4: case 5:
		System.out.println("��");
		break;
		case 7: case 8: case 6:
		System.out.println("����");
		break;
		case 9: case 10: case 11: 
		System.out.println("����");
		break;
		case 12: case 1: case 2: 
		System.out.println("�ܿ�");
		break;
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("�� ���Դϱ�?:");
		int month = a.nextInt();
		System.out.print("�ش� ���� ������ ");
		season(month);
		System.out.print("�Դϴ�.");

	}

}
