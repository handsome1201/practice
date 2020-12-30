package practice2;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("값을 입력하세요:");
	int x = a.nextInt();
	System.out.println("값을 입력하세요:");
	int y = a.nextInt();
			
	if (x >y)
		System.out.println(x+"가"+y+"보다 큽니다");
	else if(x<y)
		System.out.println(x+"가"+y+"보다 작습니다");
	else
		System.out.println("똑같습니다");
	}

}
