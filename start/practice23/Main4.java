package practice23;

import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		if(x==3) {
			for(int i=0; i<3; i++) {
				System.out.print("*");
			}
			System.out.println();
			for(int j=0; j<3; j++) {
				if(j%2==0) {
					System.out.print('*');
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			for(int k=0; k<3; k++) {
				System.out.print("*");
			}
		}
		if(x>3) {
			
		}
	}
}

