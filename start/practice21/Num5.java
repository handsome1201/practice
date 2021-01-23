package practice21;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°¹¼ö: ");
		int x = a.nextInt();
		double n[] = new double[x];
		for(int i=0; i<x; i++) {
			System.out.print("°ª: ");
			n[i] = a.nextInt();
		}
		a.close();

		for(int i=1; i<x; i++) {
			double t=n[0];
			if(t<n[i]) {
				t=n[i];
				n[i]=n[i-1];
				n[0]=t;
			}
		}
		for(int i=1; i<x; i++) {
			n[i]=n[i]/n[0]*100;
		}
		double sum=0;
		for(int i=0; i<x; i++) {
			sum=sum+n[i];
		}
		System.out.println(sum/x);
	}

}
