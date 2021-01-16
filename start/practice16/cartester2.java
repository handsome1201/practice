package practice16;

import java.util.Scanner;

public class cartester2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("차량 데이터를 입력하세요");
		System.out.print("이름: ");
		String name= a.next();
		System.out.print("번호: ");
		String number = a.next();
		System.out.print("전폭: ");
		int width = a.nextInt();
		System.out.print("전고: ");
		int height = a.nextInt();
		System.out.print("전징: ");
		int length = a.nextInt();
		System.out.print("탱크용량: ");
		int tankage = a.nextInt();
		System.out.print("연료량: ");
		int fuel = a.nextInt();
		System.out.print("연비: ");
		int sfc = a.nextInt();

		car mycar = new car(name, number, width, height, length, tankage, fuel, sfc);




		while(true) {
			System.out.println("현재 위치: "+"("+mycar.getx()+","+mycar.gety()+")");
			System.out.println("남은 연료: "+mycar.getfuel());
			System.out.print("이동하시겠습니까? [0_no / 1_yes]: ");
			int pick = a.nextInt();
			if(pick==0) {
				break;
				}
			else {
				System.out.print("x방향으로의 이동 거리: ");
				double dx = a.nextDouble();
				System.out.print("y방향으로의 이동 거리: ");
				double dy = a.nextDouble();

				if(!mycar.move(dx, dy)) {
					System.out.println("연료 부족!");
				}
			}
		}

	}
}
