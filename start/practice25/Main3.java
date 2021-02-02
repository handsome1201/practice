package practice25;

import java.util.Scanner;
import java.util.Arrays;

public class Main3 {

	static char arr[][];
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("°ª: ");
		int N = a.nextInt();
		arr= new char[N][N];
		for(int i=0; i<N; i++) {

			Arrays.fill(arr[i],' ');

		}
		printstar(N, 0, 0);

		StringBuilder sb= new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(arr[i][j]);
			}sb.append("\n");
		}
		System.out.println(sb.toString());


	}
	public static void printstar(int n, int x, int y) {
		if(n==1) {
			arr[x][y]='*';
			return;
		}
		int val=n/3;

		for(int i=0; i<3; i++) {
			for(int j=0;j<3; j++) {
				if(i==1&&j==1) {					
				}
				else {
					printstar(val,x+i*val,y+j*val);
				}
			}
		}
	}
}
