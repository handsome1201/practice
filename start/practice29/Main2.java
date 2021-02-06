package practice29;

import java.util.Scanner;

public class Main2 {

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
		System.err.println("°ª: ");
		int re = a.nextInt();
		int s = signof(re);
		System.out.println(s);
		a.close();
	}

}
