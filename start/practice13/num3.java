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
		System.out.print("a�� ��: ");
		int q= a.nextInt();
		System.out.print("b�� ��: ");
		int w= a.nextInt();
		System.out.print("c�� ��: ");
		int e= a.nextInt();
		System.out.print("d�� ��: ");
		int r= a.nextInt();
		System.out.println("a�� ������ "+absolute(q));
		System.out.println("b�� ������ "+absolute(w));
		System.out.println("c�� ������ "+absolute(e));
		System.out.println("d�� ������ "+absolute(r));
	}

}
