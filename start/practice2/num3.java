package practice2;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("값을 입력하세요");
	int x = a.nextInt();
	
	if(x>=0)
		System.out.println(x);
	else
		System.out.println(-x);

	}

}
