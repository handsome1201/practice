package practice10;

import java.util.Random;
import java.util.Scanner;

public class num5 {

	static Scanner a = new Scanner(System.in);

	static int retry() {
		int c=0;
		do {
			System.out.print("다시 한 번? <yes..1/no..0>: ");
			c= a.nextInt();
		}
		while(c !=1 && c !=0);
		return c;
	}

	public static void main(String[] args) {
		System.out.println("암산 훈련!");
		Random ran = new Random();
		int r = 100+ran.nextInt(900);
		int t = 100+ran.nextInt(900);
		int y = 100+ran.nextInt(900);
		int n = ran.nextInt(4);

		int c =0;
		do {

			int answer = 0;
			int x =25;
			while(answer != x) {
				switch(n) {
				case 0 : answer = r+t+y;
				System.out.print(r+"+"+t+"+"+y+"= ");
				break;
				case 1 : answer = r+t-y;
				System.out.print(r+"+"+t+"-"+y+"= ");
				break;
				case 2 : answer = r-t+y;
				System.out.print(r+"-"+t+"+"+y+"= ");
				break;
				case 3 : answer = r-t-y;
				System.out.print(r+"-"+t+"-"+y+"= ");
				break;
				}
				x = a.nextInt();
				if(answer == x) {
					retry();
				}
				else {
					System.out.println("틀렸습니다!");
				}
			}
		}
		while(c == 1);
	}
}
