package practice6;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("������ x,y,z�� ����� ���մϴ�.");
		System.out.println("x��:");
		int x = a.nextInt();
		System.out.println("y��:");
		int y = a.nextInt();
		System.out.println("z��:");
		int z = a.nextInt();
		double sum=0;
		sum=x+y+z;
		double ave=sum/3;
		
		System.out.println(ave);
		
	}

}
