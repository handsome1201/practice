package practice3;

import java.util.Random;
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Random a = new Random();
		Scanner b = new Scanner(System.in);
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("10���� 99������ ���ڸ� ���߼���.");
		int x = 10 +  a.nextInt(90);
		int y;
		
		do {
			System.out.println("� �����ϱ�?:");
			y=b.nextInt();
			if(x>y) {
				System.out.println("�� ū �����Դϴ�.");
			}	
			else if(x<y) {
				System.out.println("�� ���� �����Դϴ�.");
			}
		}
		while(x!= y);
		System.out.println("�����Դϴ�");
		}
		
	}

