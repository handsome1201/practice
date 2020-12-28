package practice1;

import java.util.Random;

public class num10 {

	public static void main(String[] args) {
		Random a = new Random();
	
		int n1 = 1 + a.nextInt(9);
		int n2 = -1 - a.nextInt(9);
		int n3 = 10 + a.nextInt(90);
	
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
