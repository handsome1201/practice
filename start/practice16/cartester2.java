package practice16;

import java.util.Scanner;

public class cartester2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���� �����͸� �Է��ϼ���");
		System.out.print("�̸�: ");
		String name= a.next();
		System.out.print("��ȣ: ");
		String number = a.next();
		System.out.print("����: ");
		int width = a.nextInt();
		System.out.print("����: ");
		int height = a.nextInt();
		System.out.print("��¡: ");
		int length = a.nextInt();
		System.out.print("��ũ�뷮: ");
		int tankage = a.nextInt();
		System.out.print("���ᷮ: ");
		int fuel = a.nextInt();
		System.out.print("����: ");
		int sfc = a.nextInt();

		car mycar = new car(name, number, width, height, length, tankage, fuel, sfc);




		while(true) {
			System.out.println("���� ��ġ: "+"("+mycar.getx()+","+mycar.gety()+")");
			System.out.println("���� ����: "+mycar.getfuel());
			System.out.print("�̵��Ͻðڽ��ϱ�? [0_no / 1_yes]: ");
			int pick = a.nextInt();
			if(pick==0) {
				break;
				}
			else {
				System.out.print("x���������� �̵� �Ÿ�: ");
				double dx = a.nextDouble();
				System.out.print("y���������� �̵� �Ÿ�: ");
				double dy = a.nextDouble();

				if(!mycar.move(dx, dy)) {
					System.out.println("���� ����!");
				}
			}
		}

	}
}
