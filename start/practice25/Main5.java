package practice25;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��: ");
		int x = a.nextInt();
		System.out.print("���� ��: ");
		int y = a.nextInt();

		int n[] = new int[x]; //ī�� ����ִ� ��

		for(int i=0; i<x; i++) {
			System.out.print("ī�� ��: ");
			n[i]=a.nextInt();
		}
		int m[] = new int[x*(x-1)*(x-2)];
		int j=0;
		for(int i=0; i<x; i++) {
			for(int t=0; t<x; t++) {
				for(int p=0; p<x; p++) {
					if(i!=t && t!=p && i!=p) {
						
						m[j++]=n[i]+n[t]+n[p];
					}
				}
			}
		}

		int small=0;
		for(int i=1; i<m.length; i++) {
			small=Math.abs(y-m[small])>Math.abs(y-m[i])? i: small;
		}
		System.out.println(m[small]);

	}

}
