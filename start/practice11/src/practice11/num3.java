package practice11;

import java.util.Scanner;

public class num3 {
	static int minof(int[] n) {
		int p=0;
		for(int i=0; i<n.length; i++) {
			p=n[0];
			if(p>n[i]) {
				p=n[i];
			}
		}
		return p;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("사람 수는: ");
		int x = a.nextInt();
		System.out.println("4명의 신장과 체중을 입력하자.");
		int [] min = new int[x];
		int [] max = new int[x];

		for(int i=0; i<x; i++) {
			System.out.print((i+1)+"번의 신장: ");
			min[i]=a.nextInt();
			System.out.print((i+1)+"번의 체중: ");
			max[i]=a.nextInt();
		}


		System.out.println("가장 키가 작은 사람의 신장:"+ minof(min)+"cm");
		System.out.println("가장 마른 사람의 체중: "+ minof(max)+"kg");



	}

}
