package practice11;

import java.util.Scanner;

public class num4 {
	static int linearsearch(int[] n, int key) {
		for(int i=0; i<n.length; i++) {
			if(n[i]==key) {
				return i;
			}
		}
		return -1; 
	}

	static int linearsearchr(int[] n, int key) {
		for(int i=n.length-1; i>=0; i--) {
			if(n[i]==key) {
				return i;
			}
		}
		return -1; 
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��Ҽ�: ");
		int x = a.nextInt();
		int [] n = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("x["+i+"]= ");
			n[i]=a.nextInt();
		}
		System.out.print("ã�°�: ");
		int ky = a.nextInt();
		
		System.out.println("���� �տ� ��ġ�� ����  "+"n["+ linearsearch(n,ky)+"]"+" �� �ֽ��ϴ�." );
		System.out.println("���� �ڿ� ��ġ�� ����  "+"n["+ linearsearchr(n,ky)+"]"+"�� �ֽ��ϴ�." );
	}

}
