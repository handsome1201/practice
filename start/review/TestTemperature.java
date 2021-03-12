package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTemperature{

	public static void main(String[] args) throws java.lang.Exception{
		List<Temperable> list = new ArrayList<Temperable>();

		Scanner scr = new Scanner(System.in);
		String repeat = scr.nextLine();
		int repeatcount = Integer.parseInt(repeat);
		for(int i=0; i<repeatcount; i++) {
			String tempsentence = scr.nextLine();
			String[] card = tempsentence.split(" ");
			double temper1 = Double.parseDouble(card[0]);
			char alpha1 = card[1].charAt(0);
			Temperature1 t = new Temperature1(temper1, alpha1);
			if(alpha1=='C') {
				System.out.println(Math.round((t.getFahrenheit())*100.0)/100.0);
			}
			else {
				System.out.println(Math.round(t.getCelcius()*100.0)/100.0);
			}
		}
		scr.close();
	}

}
