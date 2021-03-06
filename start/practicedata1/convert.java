package practicedata1;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String select = scr.nextLine();
		int temperature = scr.nextInt();

		MyTemperature MT = new MyTemperature(temperature, select);
		MT.setCelsius(temperature);
		
		scr.close();
	}

}
