package practice5;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("2�̻��� ������:");
		int x = a.nextInt();
		
		int i;
		for(i=2;i<=x;i++)
				if(x%i==0)
					break;
		if(i==x) {
			System.out.println("�Ҽ��Դϴ�");
		}
		else
			System.out.println("�Ҽ��� �ƴմϴ�");
	}

}
