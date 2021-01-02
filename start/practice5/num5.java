package practice5;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.println("몇 개을 더할까요?:");
		int x= a.nextInt();
		
		int i;
		int sum=0;
		for(i=0; i<=x;i++) {
			System.out.println("정수(0으로 종료):");
			int y=a.nextInt();
			if(y==0) 
			break;
			sum+=y;
		}
		System.out.println("합계는"+sum+"입니다.");
		System.out.println(sum/i);
	}	

}
