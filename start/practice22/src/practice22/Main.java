package practice22;

import java.util.Scanner;

public class Main {

	static void num(int a) {
		int count=0;
		if(a>=100) {
			for(int i=100; i<=a; i++) {
				if((i/100)-((i/10)%10)==((i/10)%10)-i%10) {
					count++;
				}
			}
			System.out.println(count+99);
		}
		else {
			count=a;
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력: ");
		int x = a.nextInt();
		num(x);
		a.close();
	}


}
