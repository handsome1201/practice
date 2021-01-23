package practice21;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n[] = new int[10];
		int p[] = new int[42];
		for(int i=0; i<10; i++) {
			System.out.print("°ª: ");
			n[i] = a.nextInt();
		}
		a.close();
		
		int count=0;
		for(int i=0; i<n.length; i++) {
			p[ n[i]%42 ]++;
		}
		for(int i=0; i<p.length; i++) {
			if(p[i] !=0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
