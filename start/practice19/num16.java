package practice19;

import java.util.Scanner;

public class num16 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int h = a.nextInt();
		int m = a.nextInt();
		
		if(m<45) {
			System.out.println((h-1)+" "+((60+m)-45));
		}
		else {
			System.out.println(h+" "+(m-45) );
		}
	}

}
