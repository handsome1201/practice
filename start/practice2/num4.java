package practice2;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.print("값을 입력하세요:");
	int x = a.nextInt();
	System.out.print("값을 입력하세요");
	int y = a.nextInt();
	
	if(x%y==0)
		System.out.println(y+"는"+x+"의 약수입니다");
	else
		System.out.println(y+"은"+x+"의 약수가 아닙니다");
	}

}
