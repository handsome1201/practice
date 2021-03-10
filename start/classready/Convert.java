package classready;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int count = scr.nextInt();
		double[] tem = new double[count];
		char[] write = new char[count];
		for(int i=0; i<tem.length; i++) {
			double Value = scr.nextDouble();
			char Scale = scr.next().charAt(0);
			tem[i]=Value;
			write[i]=Scale;

		}

		
		for(int i=0; i<tem.length; i++) {
			Temperature T = new MyTemperature(tem[i],write[i]);
			if(write[i]=='F') {
				System.out.println(Math.round(T.getCelcius()*100.0)/100.0);
			}
			else{{
				
				System.out.println(Math.round(T.getFahrenheit()*100.0)/100.0);
			}
			}
		}
		scr.close();
	}
}
