package practice24;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int x = a.nextInt();
		int y=2*x;
		int [] n = new int[y];
		int re=0;
		int cnt=0;
		if(x>2) {
			for(int i=x; i<=y; i++) {
				for(int j=2; j<i; j++) {
					re=i%j;
					if(re==0) {
						break;	
					}
				}
				if(re!=0) {
					n[cnt]=i;
					cnt++;
				}

			}
			int count=0;
			for(int i=0; i<n.length; i++) {
				if(n[i]!=0) {
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
}


