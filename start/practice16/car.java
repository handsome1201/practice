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
		System.out.println("�̸�:"+ name);
		System.out.println("��ȣ: "+number);
		System.out.println("����: "+width);
		System.out.println("����: "+height);
		System.out.println("����: "+length);
		System.out.println("��ũ: "+tankage);
		System.out.println("����: "+sfc);	
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


