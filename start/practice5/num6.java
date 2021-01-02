package practice5;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.println("몇 개을 더할까요?:");
		int x= a.nextInt();
		
		int i;
		int sum=0;
		for(i=1; i<=x; i++) {
			System.out.println("정수:");
			int y=a.nextInt();
			sum+=y;
			if(sum>1000) {
				System.out.println("1000을 넘었습니다.");
				System.out.println("마지막 값을 무시합니다.");
			break;
			}
		}
		
		System.out.println("합계는"+sum+"입니다.");
		System.out.println(sum/x);
	}	

}
