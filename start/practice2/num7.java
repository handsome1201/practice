package practice2;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���:");
	int x= a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int y= a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int z= a.nextInt();
	
	int min;
	if(x>y)
		if(y>z)
			min=z;
		else
			min=y;
	else if(x<y)
		if(x>z)
			min=z;
		else
			min=x;
	else
		if(x>z)
			min=z;
		else
			min=x;
	
	System.out.println(min);
	}

}
