package practice11;

import java.util.Scanner;

public class num2 {
	static int sumof(int[] n) {
		int sum=0;
		for(int i=0; i<n.length; i++) {
			sum+=n[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("요소수: ");
		int t = a.nextInt();
		int [] x = new int[t];

		for(int i=0; i<t; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = a.nextInt();
		}
		System.out.println("모든 요소의 합은 "+sumof(x)+"입니다.");

	}

}
