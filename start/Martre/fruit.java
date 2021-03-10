package Martre;

class fruit extends Goods implements Comparable <Goods> {
	private String discountfruit;     //할인과일, 일반과일


	public fruit(String name, String discountfruit,int stock ) {
		super(name, stock);
		this.discountfruit = discountfruit;
	}
	public String toString() {
		return (this.name +", " +this.discountfruit + ", " + this.stock);
	}
	public int compare(Object s){
		fruit f = (fruit) s;
		if(this.discountfruit.compareTo(f.discountfruit)<0){
			return -1;
		}
		else if(this.discountfruit.compareTo(f.discountfruit)>0){
			return 1;
		}
		else{
			if(this.stock<f.stock) {
				return 1;
			}
			else if(this.stock>f.stock) {
				return -1;
			}
		}
		return 0;
	}
}

