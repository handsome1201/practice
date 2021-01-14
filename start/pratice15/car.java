package pratice15;

public class car {

	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;

	car(String name, String number, int width, int height, int length, double tankage, double fuel, double sfc){
		this.name=name;
		this.number=number;
		this.width=width;
		this.height=height;
		this.length=length;
		this.tankage=tankage;
		this.fuel=(tankage>=fuel) ? fuel:tankage;
		this.sfc=sfc;
		x=y=0;
	}


	double getx() {
		return x;
	}
	double gety() {
		return y;
	}
	double getsfc() {
		return sfc;
	}

	void purspec() {
		System.out.println("�̸�: "+name);
		System.out.println("��ȣ: "+number);
		System.out.println("����: "+width);
		System.out.println("����: "+height);
		System.out.println("����: "+length);
		System.out.println("��ũ: "+tankage);
		System.out.println("����: "+sfc);
	}

	boolean move(double dx, double dy) {
		double dt = Math.sqrt(x*x+y*y);
		double f = dt/fuel;

		if(f>fuel) {
			return false;
		}
		else {
			fuel-= f;
			x+=dx;
			y+=dy;
			return true;
		}

	}
	void refuel(double df) {
		if(df>0) {
			fuel+=df;
			if(fuel>tankage) {
				fuel=tankage;
			}
		}

	}

}
