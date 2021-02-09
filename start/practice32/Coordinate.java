package practice32;

class Coordinate {
	private double x;
	private double y;
	
	Coordinate(double x, double y){
		this.x=x;
		this.y=y;
	}
	//xÁÂÇ¥ °¡Á®¿À±â
	double getX() {
		return x;
	}
	//yÁÂÇ¥ °¡Á®¿À±â
	double getY() {
		return y;
	}
	//xÁÂÇ¥ ¼³Á¤ÇÏ±â
	double setX(double x) {
		return this.x=x;
	}
	//yÁÂÇ¥ ¼³Á¤ÇÏ±â
	double setY(double y) {
		return this.y=y;
	}
	//ÁÂÇ¥¼³Á¤
	void set(double x, double y) {
		this.x=x;
		this.y=y;
	}
}
