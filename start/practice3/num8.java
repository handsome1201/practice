package practice3;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���� ������:");
		int x = a.nextInt();
		
		int n=1;
		int result=1;
		
		while(n<=x) {
			result=result*n;
			n++;
		}
		System.out.println(result);
	}

}
