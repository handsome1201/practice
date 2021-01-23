package practice21;

import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
			System.out.print("°ª: ");
			int x =a.nextInt();
			int y = a.nextInt();
			int z = a.nextInt();
			
			int n[] = new int[10];
			int result = x * y *z;
			while(result>0) {
				n[result%10]++;
				result=result/10;
				
			}
			for(int i =0; i<n.length; i++) {
				System.out.println(n[i]);
			}
	}

}

