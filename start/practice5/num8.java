package practice5;

import java.util.Random;
import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran=new Random();
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("0���� 99������ ���ڸ� ���߼���.");
		
		int r=ran.nextInt(100);
		for(int i=6; i>=0; i--) {
			System.out.print("���� Ƚ��"+i+"ȸ,� �����ϱ�?:");
			int x=a.nextInt();
			if(x==r) {
				System.out.println(6-i+"ȸ���� ���߾����ϴ�.");
				break;
			}	
			else if(x>r) {
				System.out.println("�� ���� �����Դϴ�");
			}
			else {
				System.out.println("�� ū �����Դϴ�.");
			}
		if(i==0) {
			System.out.println("������"+r+"�Դϴ�");
		}
		}
	}

}
