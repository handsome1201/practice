package practicedata;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String sentence = scr.nextLine();
		int sentencecount = Integer.parseInt(sentence);
		
		String sentence1 = scr.nextLine();
		String[] repeat = sentence1.split(" ");
		
		for(int i=0; i<sentencecount; i++) {
			String sentence2 = scr.nextLine();
			int repeatnumber = Integer.parseInt(repeat[i]);
			for(int j=0; j<repeatnumber; j++) {
				System.out.println(sentence2);
			}
		}
		
		scr.close();
	}

}
