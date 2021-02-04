package practice27;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("넓이: ");	
		int wid=a.nextInt();
		System.out.println("인구: ");
		int people=a.nextInt();
		int all = people*wid;
		System.out.println("기사 수: ");
		int x=a.nextInt();
		int y=a.nextInt();
		int z=a.nextInt();
		int p=a.nextInt();
		int q=a.nextInt();

		System.out.println(x-all);
		System.out.println(y-all);
		System.out.println(z-all);
		System.out.println(p-all);
		System.out.println(q-all);

		a.close();
	}

}
