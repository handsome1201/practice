package Mart;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws java.lang.Exception {
		ArrayList<Good> list1 = new ArrayList<Good>();
		Scanner scr = new Scanner(System.in);
		String count = scr.nextLine();
		int thingcount = Integer.parseInt(count);
		for(int i=0; i<thingcount; i++) {
			String card= scr.nextLine();
			String [] repeat = card.split(" ");
			String Kind = repeat[0];
			String Name = repeat[1];
			int Stock = Integer.parseInt(repeat[3]);
			if(Kind.equals("E")) {
				int Numbere = Integer.parseInt(repeat[2]);
				list1.add(new Goods2(Kind, Name, Numbere, Stock));
			}
			else {
				String Numberf = repeat[2];
				list1.add(new Goods1(Kind, Name, Numberf, Stock));
			}
		}
		Collections.sort(list1);

		java.util.Iterator<Good> iter = list1.iterator();
		PrintStream out;
		try {
			out = new PrintStream(System.out, true, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return;
		}
		while(iter.hasNext()){
			Good str = (Good)iter.next();
			out.println(str);
		}
		scr.close();
	}

}
