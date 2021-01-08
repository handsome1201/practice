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
		System.out.print("정수a:");
		int a = w.nextInt();
		System.out.print("정수b:");
		int b = w.nextInt();
		System.out.print("정수c:");
		int c = w.nextInt();
		System.out.println("중간값은 "+min(a,b,c)+"입니다.");
	}

}
