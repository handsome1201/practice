package practice5;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.println("�� ���� ���ұ��?:");
		int x= a.nextInt();
		
		int i;
		int sum=0;
		for(i=1; i<=x; i++) {
			System.out.println("����:");
			int y=a.nextInt();
			sum+=y;
			if(sum>1000) {
				System.out.println("1000�� �Ѿ����ϴ�.");
				System.out.println("������ ���� �����մϴ�.");
			break;
			}
		}
		
		System.out.println("�հ��"+sum+"�Դϴ�.");
		System.out.println(sum/x);
	}	

}
