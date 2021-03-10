package Matre1;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		List<Goods> list = new ArrayList<Goods>();
		String repeat = scr.nextLine();
		int repeatcount = Integer.parseInt(repeat);
		for(int i=0; i<repeatcount; i++) {
			String information = scr.nextLine();
			String[] card = information.split(" ");
			char kind = card[0].charAt(0);
			if(kind=='F') {
				String name = card[1];
				String discountfruitkind = card[2];
				int stock = Integer.parseInt(card[3]);
				list.add(new Fruit1(name, discountfruitkind, stock));
			}
			else {
				String name = card[1];
				int modelnumber = Integer.parseInt(card[2]);
				int stock = Integer.parseInt(card[3]);
				list.add(new Electric(name, modelnumber, stock));
			}
			Collections.sort(list);



		}
		Iterator iter = list.iterator();
		PrintStream out;
		try {
            out = new PrintStream(System.out, true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return;
        }
		while(iter.hasNext()) {
			Goods str = (Goods) iter.next();
			out.println(str);
		}

		scr.close();
	}

}
