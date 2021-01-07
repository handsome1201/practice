package practice8;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int number=6;
		int [] n = new int[number];
		int [] m = new int[number];
		double [] o = new double[number];
		
		System.out.println("6명의 국어, 수학 점수를 입력하세요.");
		for(int i=0; i<6; i++) {
			System.out.print((i+1)+"번 국어:");
			n[i] = a.nextInt();
			System.out.print("      수학:");
			m[i] =a.nextInt();
		}
		
		for(int i=0; i<6; i++) {
			o[i]= (double)(n[i]+m[i])/2;
		}
		
		System.out.println("NO.  국어  수학  평균");
		for(int i=0; i<6; i++) {
			System.out.println((i+1)+"    "+n[i]+"  "+m[i]+"  "+o[i] );
		}
	}

}
