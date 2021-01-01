package practice4;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.n의 값: ");
		int x = a.nextInt();
		int sum=0;
		
		for(int i=0; i<=x; i++)
			sum+=i;
		System.out.println(sum);
	}

}
