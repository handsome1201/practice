package practice29;

import java.util.Scanner;

public class Main4 {

	static int sumup(int n) {
		int jung=0;
		for(int i=1; i<=n; i++) {
			jung+=i;
		}
		
		
		return jung;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.err.print("°ª: ");
		int re = a.nextInt();
		System.out.println(sumup(re));

	}

}
