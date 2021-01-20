package practice17;

import java.util.Scanner;

public class coordinatetest4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("ÁËÇ¥´Â ¸î°³: ");
		int x = a.nextInt();
		coordinate [] n = new coordinate[x];
		
		for(int i=0; i<x; i++) {
		n[i] = new coordinate(5.5,7.7);
		}

		for(int i=0; i<x; i++) {
			System.out.println("a["+i+"]= ("+n[i].getx()+","+n[i].gety()+")");
		}
	}

}
r