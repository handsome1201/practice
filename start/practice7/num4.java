package practice7;

import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("사람 수:");
		int x = a.nextInt();
		int []n = new int[x];
		System.out.println("점수를 입력하세요.");
		
		double sum=0;
		for(int i=0; i<x; i++) {
			System.out.print((i+1)+"번의 "+"점수:");
			n[i] =a.nextInt();
			sum+=n[i];
		}
		double result=0;
		result = sum/x;		
		System.out.println("평균은:"+result);
		
		int max=0;
		int min=0;
		
		for(int i=0; i<x; i++) {
			if(n[i]>max) {
				max=n[i];
			}
			min=n[0];
			if(n[i]<min) {
				min=n[i];
			}
			
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
		

	}

}
