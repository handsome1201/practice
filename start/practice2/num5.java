package practice2;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���:");
	int x = a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int y = a.nextInt();
			
	if (x >y)
		System.out.println(x+"��"+y+"���� Ů�ϴ�");
	else if(x<y)
		System.out.println(x+"��"+y+"���� �۽��ϴ�");
	else
		System.out.println("�Ȱ����ϴ�");
	}

}
