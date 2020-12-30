package practice2;

import java.util.Random;

public class num9 {

	public static void main(String[] args) {
	Random a = new Random();
	
	System.out.println("컴퓨터는 뭘 낼까요?");
	int x=a.nextInt(3);
	
	if(x==1) {
		System.out.println("바위");
	}
	if(x==0) {
		System.out.println("가위");
	}
	if(x==2) {
		System.out.println("보");
	}
	}

}
