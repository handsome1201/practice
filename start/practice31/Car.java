package practice31;

class Car {
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

	Car (String name, String number, int width,	 int height, int length, double tankage, double fuel, double sfc){
		this.name=name;
		this.number=number;
		this.width=width;
		this.height=height;
		this.length=length;
		this.tankage=tankage;
		this.fuel=(fuel<=tankage)?fuel:tankage;
		this.sfc=sfc;
	} //생성자

	double getX() {
		return x;
	}	//x위치 호출

	double getY() {
		return y;
	}	//y위치 호출

	double getFuel() {
		return fuel;
	}	//연료 호출
	
	void spec() {
		System.out.println(name);
		System.out.println(number);
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		System.out.println(tankage);
		System.out.println(sfc);

	} //사양 표시

	boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx+dy*dy);
		double f = distance/sfc; //이동에 필요한 연료
		if(f>fuel) {
			return false;
		}
		else {
			fuel-=f;
			x+=dx;
			y+=dy;
			return true;
		}
	}

	void refuel(double df) {
		if(df>0) {
			fuel+=df;
			if(tankage<fuel) {
				fuel=tankage;
			}
		}
	}
}
