package practice3;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("���� �������� �ڸ����� ǥ���մϴ�.");
		System.out.println("���� ������:");
		int x = a.nextInt();
		
		int result=0;
		
		
		while(x>0) {
				result++;
				x=x/10;
		}
		System.out.println("�Է��� ���ڴ�"+result+"�Դϴ�");
		
	}

}
