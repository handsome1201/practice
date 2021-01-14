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
		System.out.println("이름: "+name);
		System.out.println("번호: "+number);
		System.out.println("전폭: "+width);
		System.out.println("전고: "+height);
		System.out.println("전장: "+length);
		System.out.println("탱크: "+tankage);
		System.out.println("연비: "+sfc);
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
