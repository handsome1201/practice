package practice14;

public class node {
	
	private int x;
	private int y;
	
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x = x;
	}
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y = y;
	}
	
	public node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public node getcenter(node other) {
		return new node((this.x + other.getx())/2, (this.y +other.gety())/2);
	}
}
