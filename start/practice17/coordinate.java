package practice17;

public class coordinate {
	private double x;
	private double y;

	coordinate(double x, double y){
		this.x = x;
		this.y = y;

	}

	double getx() {
		return x;
	}
	double gety() {
		return y;
	}

	void setx(double x) {
		this.x=x;
	}
	void sety(double y) {
		this.y=y;
	}
	void set(double x, double y) {
		this.x=x;
		this.y=y;
	}
}
