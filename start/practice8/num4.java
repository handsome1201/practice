package practice8;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int number=6;
		int [] n = new int[number];
		int [] m = new int[number];
		double [] o = new double[number];
		
		System.out.println("6���� ����, ���� ������ �Է��ϼ���.");
		for(int i=0; i<6; i++) {
			System.out.print((i+1)+"�� ����:");
			n[i] = a.nextInt();
			System.out.print("      ����:");
			m[i] =a.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			o[i]= (double)(n[i]+m[i])/2;
		}
		
		System.out.println("NO.  ����  ����  ���");
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+"    "+n[i]+"  "+m[i]+"  "+o[i] );
		}
	}

}
