package practice25;

import java.util.Scanner;

public class Main1 {
	public static int fac(int number) {
		if(number==1) {
			return 1;
		}
		else {
			return number*fac(number-1);
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x =a.nextInt();
		System.out.println(fac(x));
		a.close();
	}

}
