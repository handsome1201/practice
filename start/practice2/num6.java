package practice2;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���:");
	int x = a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int y = a.nextInt();
	
	int max;
	if (x>y)
		max=x-y;
	else if(x<y)
		max=y-x;
	else
		max=0;
		
	System.out.println(max);

	}

}
