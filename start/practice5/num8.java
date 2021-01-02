package practice5;

import java.util.Random;
import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random ran=new Random();
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		int r=ran.nextInt(100);
		for(int i=6; i>=0; i--) {
			System.out.print("남은 횟수"+i+"회,어떤 숫자일까?:");
			int x=a.nextInt();
			if(x==r) {
				System.out.println(6-i+"회만에 맞추었습니다.");
				break;
			}	
			else if(x>r) {
				System.out.println("더 작은 숫자입니다");
			}
			else {
				System.out.println("더 큰 숫자입니다.");
			}
		if(i==0) {
			System.out.println("정답은"+r+"입니다");
		}
		}
	}

}
