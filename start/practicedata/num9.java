package practicedata;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("x: ");
		int x = scr.nextInt();
		System.out.print("y: ");
		int y = scr.nextInt();
		System.out.print("z: ");
		int z = scr.nextInt();

		System.out.print("¹è¿­¼ö: ");
		int num = scr.nextInt();
		int []a = new int[num];
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]=");
			int arraylist = scr.nextInt();
			a[i]=arraylist;
		}

		System.out.println(MinMax.tmin(x,y));
		System.out.println(MinMax.tmax(x,y));
		System.out.println(MinMax.min(x,y,z));
		System.out.println(MinMax.max(x,y,z));
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		scr.close();	
	}

}
