package practice2;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���:");
	int x = a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int y = a.nextInt();
	System.out.println("���� �Է��ϼ���:");
	int z = a.nextInt();
	
	int t;
	if(x>y) {
		t = x;
		x=y;
		y = t;
	}	
	if(y>z) {
		t= y;
		y = z;
		z= t;
	}	
	if(x>y) {
		t = x;
		x = y;
		y = t;
	}	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}

}
