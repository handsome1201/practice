package practice4;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("��cm����:");
		int x = a.nextInt();
		System.out.println("��cm����:");
		int y = a.nextInt();
		System.out.println("�� cm��������:");
		int z = a.nextInt();
		System.out.println("���� ǥ�� ü��");
		System.out.println("----------");
		
		for(int i=x; i<=y; i+=z) {
			System.out.println(i+"  "+ 0.9*(i-100));
		}
	}
	

}
