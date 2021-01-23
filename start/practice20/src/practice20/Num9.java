package practice20;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력하세요: ");
		int x = a.nextInt();
		int y=0;
		int count=0;
		while(x !=y) {			
			int one = x%10;
			int ten = x/10;
			if(one+ten>=10) {
				y=one+ten-10+(one*10);
			}
			else {
				y= one+ten+(one*10);
			}
			count++;
		}
		System.out.println(count);
	}

}
