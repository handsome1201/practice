package practice2;

import java.util.Random;

public class num9 {

	public static void main(String[] args) {
	Random a = new Random();
	
	System.out.println("��ǻ�ʹ� �� �����?");
	int x=a.nextInt(3);
	
	if(x==1) {
		System.out.println("����");
	}
	if(x==0) {
		System.out.println("����");
	}
	if(x==2) {
		System.out.println("��");
	}
	}

}
