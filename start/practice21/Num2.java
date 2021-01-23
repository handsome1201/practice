package practice21;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int []n = new int[9];
		for(int i=0; i<9; i++) {
			System.out.print("°ª: ");
			int y = a.nextInt();
			n[i] = y;
		}
		int t=0;
		int p=0;
		for(int i=1; i<9; i++) {
			if(t<n[i]) {
				t=n[i];
				p=i;
			}
		}
		System.out.print(t);
		System.out.println();
		System.out.print(p+1);


	}

}
