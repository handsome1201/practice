package practice20;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		System.out.print("기준값을 입력하세요: ");
		int y = a.nextInt();
		int [] n = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("입력: ");
			int t = a.nextInt();
			n[i]=t;
		}
		for(int i=0; i<x; i++) {
			if(n[i]<y) {
				System.out.println(n[i]);
			}
		}

	}

}
