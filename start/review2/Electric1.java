package review2;

class Electric1 extends Goods implements Comparable<Goods>{
	int modelnumber;

	public Electric1(String name, int modelnumber, int stock) {
		super(name,stock);
		this.modelnumber=modelnumber;
	}
	public String toString() {
		return this.name+", "+this.modelnumber+", "+this.stock;
	}
	public int compare(Object o) {
		Electric1 e = (Electric1) o;
		if(this.modelnumber < e.modelnumber) {
			return -1;
		}
		else if(this.modelnumber > e.modelnumber) {
			return 1;
		}
		else {
			if(this.stock < e.stock) {
				return 1;
			}
			else if(this.stock > e.stock) {
				return -1;
			}
		}
		return 0;
	}
}