package practice19;

import java.util.Scanner;

public class num14 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println();
		int x = a.nextInt();
		if(x%4==0 && x%100!=0) {
			System.out.println("�����Դϴ�");
		}
		else if(x%4==0 && x%100==0) {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("������ �ƴմϴ�");
		}
	}

}
