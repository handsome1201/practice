package practice26;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int [] pi = new int[100000];
		pi[0]=1;
		pi[1]=2;
		int sum=2;
		for(int i=2; i<100000; i++) {
			pi[i]=pi[i-1]+pi[i-2];
			if(pi[i]%2==0) {
				sum=sum+pi[i];
				if(sum>4000000) {
					break;
				}
			}
		}
		System.out.println(sum);

	}
}

