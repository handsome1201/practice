package practicedata;

import java.util.Random;

public class num3 {

	public static void print(int[] a) {
		System.out.print("{"+a[0]);
		for(int i=1; i<a.length; i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("}");
	}
	
	//값만 입력해주면 출력이 될 경우
	public static void main(String[] args) {
		int[] a = new int[10];
		Random ran = new Random();
		for(int i=0; i<a.length; i++) {
			a[i]=ran.nextInt(1000);
		}
		int[] aa = (int[])a.clone();
		print(a);
		print(aa);

		a[0]=a[1]=a[3]=888;

		print(a);
		print(aa);
	}

}
