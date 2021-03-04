package practicedata;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int count = scr.nextInt();
		int []c = new int[count];
		String []s = new String[count];
		for(int i=0; i<count; i++) {
			c[i]= scr.nextInt();
		}
		for(int i=0; i<count; i++) {
			s[i]=scr.nextLine();
		}
		for(int j=0; j<count; j++) {
			for(int i=0; i<c[j]; i++) {
				System.out.println(s[j]);
			}
		}

		scr.close();
	}

}
