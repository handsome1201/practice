package Mart;

abstract class Good implements Comparable<Good>{

	public String Kind;
	public String Name;
	public int Stock;
	public int Numbere;

	public Good(String Kind, String Name,int Numbere, int Stock) {
		this.Kind = Kind;
		this.Name = Name;
		this.Stock = Stock;
		this.Numbere=Numbere;
	}
	public void setCiral(int numbere) {
		this.Numbere=numbere;
	}
	public String getKind() {
		return this.Kind;
	}

	public String getName() {
		return this.Name;
	}

	public int getStock() {
		return this.Stock;
	}
	@Override
	public String toString() {
		if(Kind.equals("E")) {
			return Name+", " + Numbere + ", "+Stock;
		}
		else {
			if(Numbere==1) {
				return Name + ", " + "일반과일" + ", "+Stock;
			}
			else {
				return Name + ", " + "할인과일" + ", " + Stock;
			}
		}
	}

	@Override
	public int compareTo(Good g) {
		if(this.Kind.charAt(0)<g.Kind.charAt(0)) {
			return -1;
		}
		else if(this.Kind.charAt(0)>g.Kind.charAt(0)) {
			return 1;
		}
		else {
			if(this.Numbere>g.Numbere) {
				return 1;
			}
			else if(this.Numbere<g.Numbere){
				return -1;
			}
			else {
				if(this.Stock < g.getStock()) {
					return 1;
				}
				else if(this.Stock < g.getStock()){
					return -1;
				}
				else {
					return 0;
				}
			}
		}
		

	}
}
