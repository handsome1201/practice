package practice30;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	static int random(int a, int b) {
		Random ran = new Random();
		return a+ ran.nextInt(b-a+1);
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("���Ѱ�: ");
		int down= a.nextInt();
		System.out.print("���Ѱ�: ");
		int high= a.nextInt();
		System.out.println(random(down,high));
		a.close();
	}

}
