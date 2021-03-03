package DataStructure;

import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String line = scr.nextLine();
		int str_cnt=Integer.parseInt(line);


		line = scr.nextLine();
		String[] repeat = line.split(" ");

		for(int i =0; i<str_cnt; i++) {
			int repeat_cnt = Integer.parseInt(repeat[i]);
			line = scr.nextLine();
			for(int j=0; j<repeat_cnt; j++) {
				System.out.println(line);
			}

		}
		scr.close();
	}
}

