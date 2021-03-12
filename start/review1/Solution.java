package review1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws java.lang.Exception {
		List<Student> list = new ArrayList<Student>();
		Scanner scr = new Scanner(System.in);
		String repeat = scr.nextLine();
		int repeatcount = Integer.parseInt(repeat);
		for(int i=0; i<repeatcount; i++) {
			String information = scr.nextLine();
			String[] card = information.split(" ");
			String name = card[0];
			int score = Integer.parseInt(card[1]);
			String review = card[2];
			list.add(new Student(name, score, review));
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
