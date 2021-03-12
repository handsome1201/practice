package review2;

class Fruit1 extends Goods implements Comparable<Goods>{
	String saleornot;
	
	public Fruit1(String name, String saleornot, int stock) {
		super(name, stock);
		this.saleornot=saleornot;
	}
	public String toString() {
		return this.name+", "+this.saleornot+", "+this.stock;
	}
	public int compare(Object o) {
		Fruit1 f = (Fruit1) o;
		if(this.saleornot.compareTo(f.saleornot)<0) {
			return -1;
		}
		else if(this.saleornot.compareTo(f.saleornot)>0) {
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
