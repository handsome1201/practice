package practice24;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("��: ");
		int x = a.nextInt();
		System.out.print("��: ");
		int y = a.nextInt();
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
			System.out.println(n[0]);
		}
	}
}


