package practice2;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.print("���� �Է��ϼ���:");
	int x = a.nextInt();
	System.out.print("���� �Է��ϼ���");
	int y = a.nextInt();
	
	if(x%y==0)
		System.out.println(y+"��"+x+"�� ����Դϴ�");
	else
		System.out.println(y+"��"+x+"�� ����� �ƴմϴ�");
	}

}
