package practice23;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���� ���: ");
		int  x= a.nextInt();
		System.out.print("���� ���: ");
		int y = a.nextInt();
		System.out.print("�Ǹ� ���: ");
		int z = a.nextInt();
		
		int count=0;
		
		while(x+(count*y)-(count*z)>=0) {
			count++;
		}
		System.out.println(count);
	}

}
