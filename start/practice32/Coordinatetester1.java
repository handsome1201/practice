package practice32;

import java.util.Scanner;

public class Coordinatetester1 {

	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);
		System.out.println("��ǥ p�� �Է��ϼ���.");
		System.out.print("x��ǥ: ");
		double x = stdn.nextDouble();
		System.out.print("y��ǥ: ");
		double y = stdn.nextDouble();
		System.out.println("��ǥ q�� �Է��ϼ���.");
		System.out.print("x��ǥ: ");
		double x1 = stdn.nextDouble();
		System.out.print("y��ǥ: ");
		double y1 = stdn.nextDouble();

		Coordinate p = new Coordinate(x,y);
		Coordinate q = new Coordinate(x1,y1);

		if(p.getX()==q.getX() && p.getY()==q.getY()) {
			System.out.println("���� �����ϴ�.");
		}
	}
}
