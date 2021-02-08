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
	} //������

	double getX() {
		return x;
	}	//x��ġ ȣ��

	double getY() {
		return y;
	}	//y��ġ ȣ��

	double getFuel() {
		return fuel;
	}	//���� ȣ��
	
	void spec() {
		System.out.println(name);
		System.out.println(number);
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		System.out.println(tankage);
		System.out.println(sfc);

	} //��� ǥ��

	boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx+dy*dy);
		double f = distance/sfc; //�̵��� �ʿ��� ����
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
