package practice23;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		int sum=1;
		for(int i=1; i<=x; i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
