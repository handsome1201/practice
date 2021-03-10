package Mart;

class Goods2 extends Good{
	public int Numbere;

	public Goods2(String Kind, String Name, int Numbere, int Stock) {
		super(Kind, Name, Numbere, Stock);
		
	}

	public int getNumbere() {
		return this.Numbere;

	}
}