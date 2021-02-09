package practice32;

class Coordinatetester3 {
	private double x = 0.0;
	private double y = 0.0;

	//»ı¼ºÀÚ
	public Coordinatetester3() {}
	public Coordinatetester3(double x, double y) {
		set(x,y);
	}
	public Coordinatetester3(Coordinatetester3 c) {
		this.x=x;
		this.y=y;
	}
	
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	double setX(double x) {
		return this.x=x;
	}
	double setY(double y) {
		return this.y=y;
	}
	public void set(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
}
