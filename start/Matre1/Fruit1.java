package Matre1;

class Fruit1 extends Goods implements Comparable<Goods>{
	String discountfruitkind;

	public Fruit1(String name, String discountfruitkind, int stock) {
		super(name,stock);
		this.discountfruitkind=discountfruitkind;
		this.name=name;
		this.stock=stock;
	}
	public String toString() {
		return this.name+", "+this.discountfruitkind+", "+this.stock;
	}
	public int compare(Object o) {
		Fruit1 f = (Fruit1) o;
		if(this.discountfruitkind.compareTo(f.discountfruitkind)<0) {
			return -1;
		}
		else if(this.discountfruitkind.compareTo(f.discountfruitkind)>0) {
			return 1;
		}
		else {
			if(this.stock<f.stock) {
				return 1;
			}
			else if(this.stock>f.stock){
				return -1;
			}
		}
		return 0;
	}
}
