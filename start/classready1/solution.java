package classready1;

import java.util.List;
import java.util.Scanner;

import third.Student1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class solution {

	public static void main(String[] args) throws java.lang.Exception {
		List<Student> list = new ArrayList<Student>();

		Scanner scr = new Scanner(System.in);
		String count = scr.nextLine();
		int sentencecount = Integer.parseInt(count);
		for(int i=0; i<sentencecount; i++) {
			String card = scr.nextLine();
			String [] repeat = card.split(" ");
			String FirstName = repeat[0];
			int IdNumber = Integer.parseInt(repeat[1]);
			String ScoreNumber = repeat[2];
			list.add(new Student(FirstName, IdNumber, ScoreNumber));
		}
		Collections.sort(list);
		
		java.util.Iterator<Student> iter = list.iterator();
		PrintStream out;
        try {
            out = new PrintStream(System.out, true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return;
        }
		while(iter.hasNext()){
			Student str = (Student)iter.next();
			out.println(str.name);
		}

	}

}


