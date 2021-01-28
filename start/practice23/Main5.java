package practice23;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		int re=0;
		System.out.println("2");
		for(int i=2; i<=x; i++) {
			for(int j=2; j<i; j++) {
				re=i%j;
				if(re==0) {
					break;
				}
			}
			if(re!=0) {
				System.out.println(i);

			}
		}

	}

}
