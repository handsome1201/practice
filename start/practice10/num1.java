package practice10;

import java.util.Scanner;

public class num1 {
	static void putchars(String string,int n) {
		while(n-->0) {
			System.out.print(string);
		}
	}
	static void putstart(int n) {
		putchars("*",n);
	}
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는: ");
		int n = a.nextInt();
		for(int i=1; i<n+1;i++) {
			putstart(i);
			System.out.println();
		}
			

	}

}
