package Martre;

class elec extends Goods implements Comparable<Goods> {
	private int modelnumber;

	public elec(String name, int modelnumber, int stock) {
		super(name, stock);
		this.name = name;
		this.stock = stock;
		this.modelnumber = modelnumber;
	}
	public String toString() {
		return this.name +", "+ this.modelnumber + ", "+ this.stock;
	}
	public int compare(Object s){
		elec e = (elec) s;
		if(this.modelnumber < e.modelnumber) {
			return -1;
		}
		else if(this.modelnumber > e.modelnumber) {
			return 1;
		}
		else{
			if(this.stock <e.stock) {
				return 1;
			}else if(this.stock>e.stock) {
				return -1;
			}
		}
		return 0;
	}
}
