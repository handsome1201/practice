package practice17;

import java.util.Scanner;

public class coordinatetest3 {
	public static void main(String[] args) {
		System.out.println("��ǥ p�� �Է��ϼ���");
		Scanner a = new Scanner(System.in);
		System.out.print("x��ǥ: ");
		double x = a.nextDouble();
		System.out.print("y��ǥ: ");
		double y = a.nextDouble();
		System.out.println("��ǥ q�� �Է��ϼ���");
		System.out.print("x��ǥ: ");
		double x1 = a.nextDouble();
		System.out.print("y��ǥ: ");
		double y1 = a.nextDouble();

		coordinate p = new coordinate(x,y);
		coordinate q = new coordinate(x1,y1);


		if( p.getx() == q.getx() && p.gety() == q.gety()) {
			System.out.println("�����ϴ�");
		}
		else {
			System.out.println("�ٸ��ϴ�");
		}
	}
}
