package practice5;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		
		int sum=0;
	Outer:
		for(int i=1; i<=3; i++) {
			System.out.println(i+"그룹");

			for(int x=0; x<6; x++) {
				System.out.println("정수:");
				int t =a.nextInt();
				sum+=t;
				if(t==99999) {
					break Outer;
				}
				else if(t==88888) {
					continue Outer;
				}
			}
		}
		System.out.println(sum);
	}

}
