package practice9;

import java.util.Scanner;

public class num2{
	
		static int min(int a, int b, int c) {
		int min1=a;
		int t=0;
		if(min1<=b) {
			if(min1<=c) {
				t=min1;
			}
			else {
				t=c;
			}
		}
		else if(min1>=b) {
			if(b<=c) {
				t=b;
			}
			else {
				t=c;
			}
		}
		return t;
		}

	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		System.out.print("정수 a: ");
			int a=w.nextInt();
		System.out.print("정수 b: ");
			int b=w.nextInt();
		System.out.print("정수 c: ");
			int c=w.nextInt();
		System.out.println("최솟값은 "+min(a,b,c)+"입니다.");
	}

}
