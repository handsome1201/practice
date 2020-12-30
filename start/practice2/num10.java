package practice2;

import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int re;
		
		do {
			System.out.println("정숫값:");
			int x = a.nextInt();
	
			if(x>0)
				System.out.println("이 값은 양수입니다.");
			else if(x<0)
				System.out.println("이 값은 음수입니다");
			else
				System.out.println("이 값은 0입니다");
	
		System.out.println("다시 한번? 1-yes / 0-no:");
		re = a.nextInt();
	
		}
		while(re==1);
	}
}
