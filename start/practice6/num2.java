package practice6;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("정숫값 x,y,z의 평균을 구합니다.");
		System.out.println("x값:");
		int x = a.nextInt();
		System.out.println("y값:");
		int y = a.nextInt();
		System.out.println("z값:");
		int z = a.nextInt();
		double sum=0;
		sum=x+y+z;
		double ave=sum/3;
		
		System.out.println(ave);
		
	}

}
