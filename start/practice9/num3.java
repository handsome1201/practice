package practice9;

import java.util.Scanner;

public class num3 {
	static int min(int a,int b,int c) {
	int t=0;
	if(a>b) {
		if(b>c) {
			t=b;
		}
		else {
			if(a>c) {
				t=c;
			}
			else {
				t=a;
			}
		}
	}
	else if(a<b){
		if(a>c) {
			t=a;
		}
		else {
			if(b>c) {
				t=c;
			}
			else {
				t=b;
			}
		}
	}
	return t;
	}
	
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		System.out.print("����a:");
		int a = w.nextInt();
		System.out.print("����b:");
		int b = w.nextInt();
		System.out.print("����c:");
		int c = w.nextInt();
		System.out.println("�߰����� "+min(a,b,c)+"�Դϴ�.");
	}

}
