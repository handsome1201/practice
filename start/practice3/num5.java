package practice3;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("몇 개의 *를 표시할까요?:");
		int x = a.nextInt();
		
		if(x>1) {
			int  i=0;
			while(i<x) {
				System.out.print("*");
				i++;
			}
		}

	}

}
