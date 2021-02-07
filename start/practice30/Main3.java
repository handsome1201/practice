package practice30;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		int num = str.nextInt();
		for(int i=1; i<=num; i++) {
			double a= str.nextInt();
			double b=str.nextInt();
			double sum = 0;
			sum=Math.pow(a,b);
			System.out.println(sum%10);

		}
		str.close();
	}

}
