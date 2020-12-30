package practice2;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	
	System.out.print("성을 입력하세요:");
	String lastname= a.next();
	System.out.print("이름을 입력하세요:");
	String firstname = a.next();
	System.out.println("안녕하세요"+lastname+firstname+"씨");
	}

}
