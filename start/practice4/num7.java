package practice4;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("정숫값:");
		int x = a.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.println(i+"의 제곱은 "+i*i+"입니다");
		}
	}

}
