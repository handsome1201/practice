package practice32;

import java.util.Scanner;

public class Coordinatetester {

	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);
		System.out.print("x��ǥ: ");
		double x = stdn.nextDouble();
		System.out.print("y��ǥ: ");
		double y = stdn.nextDouble();

		Coordinate p = new Coordinate(x,y);
		System.out.print("P = ("+p.getX()+","+p.getY()+")");
		System.out.println();
		Coordinate q=p;
		q.set(9.9, 9.9);
		System.out.println("("+q.getX()+","+q.getY()+")");
	}

}
