package Calculator;

import java.util.Scanner;

public class sd {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String sentence = scr.nextLine();
		int sentencecount = Integer.parseInt(sentence);

		sentence = scr.nextLine();
		String[] repeat = sentence.split(" ");

		for(int i=0; i<sentencecount; i++) {
			int repeatcount = Integer.parseInt(repeat[i]);
			String sentence1=scr.nextLine();
			for(int j=0; j<repeatcount; j++) {
				System.out.println(sentence1);
			}
		}

		scr.close();
	}



}
