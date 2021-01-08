package practice9;

import java.util.Scanner;

public class num4 {
	
	static int sumup(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("1부터 x까지의 합을 구하자.");
		System.out.print("x의 값: ");
		int n = a.nextInt();
		System.out.println("1부터 "+n+"까지의 합은 "+sumup(n)+"입니다.");
	}

}
