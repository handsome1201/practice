package practice17;

import java.util.Scanner;

public class coordinatetest {

	public static void main(String[] args) {
		System.out.println("��ǥ p�� �Է��ϼ���");
		Scanner a = new Scanner(System.in);
		System.out.print("x��ǥ: ");
		double x = a.nextDouble();
		System.out.print("y��ǥ: ");
		double y = a.nextDouble();
		
		coordinate p = new coordinate(x,y);
		System.out.println("p = ("+ p.getx()+", "+p.gety()+")");
		coordinate q = p;
		q.set(9.9,9.9);
		System.out.println("p = ("+ p.getx()+", "+p.gety()+")");
		System.out.println("q = ("+ q.getx()+", "+q.gety()+")");
		
	}

}
