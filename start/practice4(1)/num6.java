package practice4;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Á¤¼ý°ª:");
		int x = a.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(x%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
