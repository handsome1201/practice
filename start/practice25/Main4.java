package practice25;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("값: ");
		int x = a.nextInt();
		System.out.print("합한 값: ");
		int y = a.nextInt();

		int n[] = new int[x];
		int p[] = new int[x];

		for(int i=0; i<x; i++) {
			System.out.print("카드 값: ");
			n[i]=a.nextInt();
		}

		int m[] = new int[x*(x-1)];
		for(int i=0; i<x; i++) {
			int j=0;
			for(int t=0; t<x; t++) {
				if(i !=t) {
					m[j]=n[i]+n[t];
					j+=1;
				}
			}

		}
		int r[]= new int[x*(x-1)];
		for(int j=0; j<x*(x-1); j++) {
			r[j]=Math.abs(y-m[j]);
		}
		for(int j=0; j<x*(x-1); j++) {
			for(int i=0; i<x; i++) {
				if(r[j]==n[i]) {
					System.out.print(y);
				}
				else {
					for(int o=0; o<x; o++) {
						System.out.println("4");
						p[o]=Math.abs(r[j]-n[o]);
						if(p[0]>p[i]) {
							p[0]=p[i];
							System.out.print(y-p[0]);
						}
					}
				}
			}
		}
		a.close();
	}
}