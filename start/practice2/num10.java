package practice2;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int re;
		
		do {
			System.out.println("������:");
			int x = a.nextInt();
	
			if(x>0)
				System.out.println("�� ���� ����Դϴ�.");
			else if(x<0)
				System.out.println("�� ���� �����Դϴ�");
			else
				System.out.println("�� ���� 0�Դϴ�");
	
		System.out.println("�ٽ� �ѹ�? 1-yes / 0-no:");
		re = a.nextInt();
	
		}
		while(re==1);
	}
}
