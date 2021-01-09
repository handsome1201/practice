package practice10;

import java.util.Random;
import java.util.Scanner;

public class num2 {
	
	static int random(int a, int b) {
		if(b<=a) {
			return a;
		}
		else {
			Random ran = new Random();
			return a + ran.nextInt(b-a+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값: ");
		int min = a.nextInt();
		System.out.print("상향값: ");
		int max = a.nextInt();
		
		System.out.println("생성한 난수는  "+random(min,max)+"입니다.");
	}

}
