package practice21;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°¹¼ö: ");
		int x = a.nextInt();
		double sum=0;
		double n[] = new double[x];
		for(int i=0; i<x; i++) {
			System.out.print("°ª: ");
			n[i] = a.nextInt();
			sum = sum + n[i];
		}
		a.close();

		double count=0;
		double result = (sum/x) ;
		for(int i=0; i<x; i++) {
			if(n[i]> result) {
				count++;
			}
		}
		double p=(count/x)*100;
		System.out.println(p);
	}

}
