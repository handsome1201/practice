package practice32;

import java.util.Scanner;

public class Coordinatetester1 {

	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);
		System.out.println("ÁÂÇ¥ p¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		System.out.print("xÁÂÇ¥: ");
		double x = stdn.nextDouble();
		System.out.print("yÁÂÇ¥: ");
		double y = stdn.nextDouble();
		System.out.println("ÁÂÇ¥ q¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		System.out.print("xÁÂÇ¥: ");
		double x1 = stdn.nextDouble();
		System.out.print("yÁÂÇ¥: ");
		double y1 = stdn.nextDouble();

		Coordinate p = new Coordinate(x,y);
		Coordinate q = new Coordinate(x1,y1);

		if(p.getX()==q.getX() && p.getY()==q.getY()) {
			System.out.println("°ªÀÌ °°½À´Ï´Ù.");
		}
	}
}
