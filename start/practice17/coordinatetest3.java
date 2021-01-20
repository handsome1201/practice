package practice17;

import java.util.Scanner;

public class coordinatetest3 {
	public static void main(String[] args) {
		System.out.println("ÁÂÇ¥ p¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		Scanner a = new Scanner(System.in);
		System.out.print("xÁÂÇ¥: ");
		double x = a.nextDouble();
		System.out.print("yÁÂÇ¥: ");
		double y = a.nextDouble();
		System.out.println("ÁÂÇ¥ q¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		System.out.print("xÁÂÇ¥: ");
		double x1 = a.nextDouble();
		System.out.print("yÁÂÇ¥: ");
		double y1 = a.nextDouble();

		coordinate p = new coordinate(x,y);
		coordinate q = new coordinate(x1,y1);


		if( p.getx() == q.getx() && p.gety() == q.gety()) {
			System.out.println("°°½À´Ï´Ù");
		}
		else {
			System.out.println("´Ù¸¨´Ï´Ù");
		}
	}
}
