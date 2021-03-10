package Matre1;

abstract class Goods implements Comparable<Goods>{
	public String name;
	public int stock;

	public Goods(String name, int stock) {
		this.name = name;
		this.stock = stock;   //재고량
	}

	@Override
	public int compareTo(Goods o) {
		if(this.getClass() == o.getClass()) {
			return this.compare(o);
		}else {
			return this.getClass().toString().compareTo(o.getClass().toString());
		}
	}

	abstract public int compare(Object o);
}
