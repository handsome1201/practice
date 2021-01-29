package practice24;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		System.out.print("°ª: ");
		int y = a.nextInt();
		System.out.print("°ª: ");
		int z= a.nextInt();

		int p=x;
		if(x>y) {
			x=y;
			y=p;
		}
		int q=y;
		if(y>z) {
			if(z>x) {
				y=z;
				z=q;
			}
			else{
				y=z;
				z=q;
				int r=y;
				y=x;
				x=y;
			}
		}
		if(x*x+y*y==z*z) {
			System.out.println("true");
		}
		else {
			System.out.println("wrong");
		}
	}

}
