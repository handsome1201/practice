package practice29;

import java.util.Scanner;

public class Main3 {

	static int signof(int x) {
		int sign=0;

		if(x<0) {
			sign=-1;
		}
		if(x>0) {
			sign=1;
		}
		return sign;

	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.err.print("°ª: ");
		int re = a.nextInt();
		System.out.print(signof(re));
		a.close();
	}

}
