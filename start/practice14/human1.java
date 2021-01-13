package practice14;

public class human1 {
	private String name;
	private int height;
	private int weight;
	
	human1(String n, int h, int w){
		name=n;
		height=h;
		weight=w;
	}
	
	String getname() {
		return name;
	}
	int getheight() {
		return height;
	}
	int getweight() {
		return weight;
	}
	
	void gainweight(int w){	
		weight+=w;
	}
	void lossweight(int w) {
		weight-=w;
	}
}
