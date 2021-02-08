package practice31;

import java.util.Scanner;

public class Cartester1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("차량 데이터를 입역하세요");
		System.out.print("이름: ");
		String name = a.next();
		System.out.print("번호: ");
		String number = a.next();
		System.out.print("전폭: ");
		int width = a.nextInt();
		System.out.print("전고: ");
		int height = a.nextInt();
		System.out.print("전징: ");
		int length = a.nextInt();
		System.out.print("탱크용량: ");
		double tankage = a.nextDouble();
		System.out.print("연료량: ");
		double fuel = a.nextDouble();
		System.out.print("연비: ");
		double sfc = a.nextDouble();

		Car mycar = new Car(name, number, width, height, length, tankage, fuel, sfc);

		while(true) {
			System.out.print("현재위치: ("+mycar.getX()+","+mycar.getY()+")");
			System.out.println();
			System.out.println("남은 연료:"+mycar.getFuel());
			System.out.println();
			System.out.print("이동하시겠습니까: 0 / 1: ");
			int gomove = a.nextInt();
			if(gomove==1) {
				System.out.print("x방향으로 이동 거리: ");
				double dx =a.nextDouble();
				System.out.print("y방향으로 이동 거리: ");
				double dy = a.nextDouble();
				if(!mycar.move(dx,dy)) {
					System.out.println("연료부족");
				}
			}
		}


	}
}
