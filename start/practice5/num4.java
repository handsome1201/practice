package practice5;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("2이상의 정숫값:");
		int x = a.nextInt();
		
		int i;
		for(i=2;i<=x;i++)
				if(x%i==0)
					break;
		if(i==x) {
			System.out.println("소수입니다");
		}
		else
			System.out.println("소수가 아닙니다");
	}

}
