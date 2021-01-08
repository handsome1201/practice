package practice9;

import java.util.Scanner;

public class num1 {

	static int signof(int n) {
		int sign=0;
		
		if(n>0) {
			sign=1;
		}
		else if(n==0) {
			sign=0;
		}
		else {
			sign=-1;
		}
		
		return sign;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("정수 x:");
		int x =a.nextInt();
		
		int s=signof(x);
		System.out.println("signof(x)는 "+s+"입니다");
	}

}
