package practice5;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.println("�� ���� ���ұ��?:");
		int x= a.nextInt();
		
		int i;
		int sum=0;
		for(i=0; i<=x;i++) {
			System.out.println("����(0���� ����):");
			int y=a.nextInt();
			if(y==0) 
			break;
			sum+=y;
		}
		System.out.println("�հ��"+sum+"�Դϴ�.");
		System.out.println(sum/i);
	}	

}
