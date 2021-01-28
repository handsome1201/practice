package practice23;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		int [] n = new int[20];
		for(int i=0; i<n.length-2; i++) {
			n[0]=0;
			n[1]=1;
			n[i+2]=n[i]+n[i+1];
		}
		System.out.println(n[x]);

	}

}
