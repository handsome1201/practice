package practice3;

import java.util.Random;
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Random a = new Random();
		Scanner b = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		int x = 10 +  a.nextInt(90);
		int y;
		
		do {
			System.out.println("어떤 숫자일까?:");
			y=b.nextInt();
			if(x>y) {
				System.out.println("더 큰 숫자입니다.");
			}	
			else if(x<y) {
				System.out.println("더 작은 숫자입니다.");
			}
		}
		while(x!= y);
		System.out.println("정답입니다");
		}
		
	}

