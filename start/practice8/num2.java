package practice8;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��Ҽ�:");
		int x = a.nextInt();
		int [] n = new int[x];
		int [] m = new int[x];
		
		for(int i=0; i<x; i++) {
			System.out.print("n["+i+"]= ");
			int y= a.nextInt();
			n[i]=y;
		}
		
		System.out.println("n�� ��� ��Ҹ� ������ �����߽��ϴ�.");
	
		for(int i=0; i<x; i++) { 
				m[x-i-1]=n[i];
		}
		for(int j=0; j<x; j++) { 
			System.out.println("n["+j+"]= "+m[j]);
		}
	}

}
