package practice32;

class Coordinate {
	private double x;
	private double y;
	
	Coordinate(double x, double y){
		this.x=x;
		this.y=y;
	}
	//x��ǥ ��������
	double getX() {
		return x;
	}
	//y��ǥ ��������
	double getY() {
		return y;
	}
	//x��ǥ �����ϱ�
	double setX(double x) {
		return this.x=x;
	}
	//y��ǥ �����ϱ�
	double setY(double y) {
		return this.y=y;
	}
	//��ǥ����
	void set(double x, double y) {
		this.x=x;
		this.y=y;
	}
}
