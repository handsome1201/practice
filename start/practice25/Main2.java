package practice25;

import java.util.Scanner;

public class Main2 {
	public static int pi(int num) {
		
		if(num==0) {
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return num+pi(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		System.out.println(pi(x));
	}

}
