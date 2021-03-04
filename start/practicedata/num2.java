package practicedata;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String sentence = scr.nextLine();
		int sentencecount = Integer.parseInt(sentence);
		
		String sentence1 = scr.nextLine();
		String [] repeat = sentence1.split(" ");
		
		for(int i=0; i<sentencecount; i++) {
			int repeat_count = Integer.parseInt(repeat[i]);
			String sentence2 = scr.nextLine();
			for(int j=0; j<repeat_count; j++) {
				System.out.println(sentence2);
			}
		}

		scr.close();
	}

}
