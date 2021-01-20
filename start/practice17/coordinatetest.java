package practice17;

import java.util.Scanner;

public class coordinatetest {

	public static void main(String[] args) {
		System.out.println("ÁÂÇ¥ p¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		Scanner a = new Scanner(System.in);
		System.out.print("xÁÂÇ¥: ");
		double x = a.nextDouble();
		System.out.print("yÁÂÇ¥: ");
		double y = a.nextDouble();
		
		coordinate p = new coordinate(x,y);
		System.out.println("p = ("+ p.getx()+", "+p.gety()+")");
		coordinate q = p;
		q.set(9.9,9.9);
		System.out.println("p = ("+ p.getx()+", "+p.gety()+")");
		System.out.println("q = ("+ q.getx()+", "+q.gety()+")");
		
	}

}
