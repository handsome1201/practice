package practice31;

import java.util.Scanner;

public class Cartester1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("���� �����͸� �Կ��ϼ���");
		System.out.print("�̸�: ");
		String name = a.next();
		System.out.print("��ȣ: ");
		String number = a.next();
		System.out.print("����: ");
		int width = a.nextInt();
		System.out.print("����: ");
		int height = a.nextInt();
		System.out.print("��¡: ");
		int length = a.nextInt();
		System.out.print("��ũ�뷮: ");
		double tankage = a.nextDouble();
		System.out.print("���ᷮ: ");
		double fuel = a.nextDouble();
		System.out.print("����: ");
		double sfc = a.nextDouble();

		Car mycar = new Car(name, number, width, height, length, tankage, fuel, sfc);

		while(true) {
			System.out.print("������ġ: ("+mycar.getX()+","+mycar.getY()+")");
			System.out.println();
			System.out.println("���� ����:"+mycar.getFuel());
			System.out.println();
			System.out.print("�̵��Ͻðڽ��ϱ�: 0 / 1: ");
			int gomove = a.nextInt();
			if(gomove==1) {
				System.out.print("x�������� �̵� �Ÿ�: ");
				double dx =a.nextDouble();
				System.out.print("y�������� �̵� �Ÿ�: ");
				double dy = a.nextDouble();
				if(!mycar.move(dx,dy)) {
					System.out.println("�������");
				}
			}
		}


	}
}
