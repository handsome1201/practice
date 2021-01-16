package practice16;

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
		this.fuel=(fuel<=tankage)? fuel:tankage;
		this.sfc=sfc;
		x=y=0;
	}
	
	double getx() {
		return x;
	}
	double gety() {
		return y;
	}
	double getfuel() {
		return fuel;
	}
	
	void putspec() {
		System.out.println("이름:"+ name);
		System.out.println("번호: "+number);
		System.out.println("전폭: "+width);
		System.out.println("전고: "+height);
		System.out.println("전장: "+length);
		System.out.println("탱크: "+tankage);
		System.out.println("연비: "+sfc);	
	}
	
	boolean move(double dx, double dy) {
		double dist=Math.sqrt(dx*dx+dy*dy);
		double f = dist/sfc;
		
		if(f>fuel) {
			return false;
		}
		else {
			fuel=fuel-f;
			x=x+dx;
			y=y+dy;
			return true;
		}
	}
	
	void refuel(double df) {
		if(df>0) {
			fuel=df+fuel;
			if(fuel>tankage) {
				fuel=tankage;
			}
		}
	}
}


