package Mart;

class Goods1 extends Good{
	public String Numberf;

	public Goods1(String Kind, String Name, String Numberf, int Stock) {
		super(Kind, Name, 0, Stock);
		if(Numberf.equals("일반과일")) {
			super.Numbere=1;
		}
		else {
			super.Numbere=2;
		}
	}

	public String getNumberf() {
		return this.Numberf;
	}
}



