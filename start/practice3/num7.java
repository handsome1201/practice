package practice3;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수를 표시합니다.");
		System.out.println("양의 정숫값:");
		int x = a.nextInt();
		
		int result=0;
		
		
		while(x>0) {
				result++;
				x=x/10;
		}
		System.out.println("입력한 숫자는"+result+"입니다");
		
	}

}
