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
		System.out.println("������ �����մϴ�.");
		System.out.print("���Ѱ�: ");
		int min = a.nextInt();
		System.out.print("���Ⱚ: ");
		int max = a.nextInt();
		
		System.out.println("������ ������  "+random(min,max)+"�Դϴ�.");
	}

}
