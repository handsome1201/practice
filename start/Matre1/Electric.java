package Matre1;

class Electric extends Goods implements Comparable<Goods>{
	int modelnumber;

	public Electric(String name, int modelnumber, int stock) {
		super(name,stock);
		this.modelnumber=modelnumber;
		this.name=name;
		this.stock=stock;
	}
	public String toString() {
		return this.name+", "+this.modelnumber+", "+this.stock;
	}
	public int compare(Object o) {
		Electric  e = (Electric) o;
		if(this.modelnumber < e.modelnumber) {
			return -1;
		}
		else if(this.modelnumber < e.modelnumber) {
			return 1;
		}
		else {
			if(this.stock <e.stock) {
				return 1;
			}
			else if(this.stock>e.stock) {
				return -1;
			}
		}
		return 0;
	}
}

