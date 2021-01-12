package practice13;

import java.util.Scanner;

public class num3 {

	static int absolute(int x) {
		return -x;
	}
	static long absolute(long x) {
		return -x;
	}
	static float absolute(float x) {
		return -x;
	}
	static double absolute(double x) {
		return -x;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("a의 값: ");
		int q= a.nextInt();
		System.out.print("b의 값: ");
		int w= a.nextInt();
		System.out.print("c의 값: ");
		int e= a.nextInt();
		System.out.print("d의 값: ");
		int r= a.nextInt();
		System.out.println("a의 절댓값은 "+absolute(q));
		System.out.println("b의 절댓값은 "+absolute(w));
		System.out.println("c의 절댓값은 "+absolute(e));
		System.out.println("d의 절댓값은 "+absolute(r));
	}

}
