package review;

 class Temperature1 implements Temperable{
	double temper;
	char alpha;
	
	public Temperature1(double temper, char alpha){
		this.temper=temper;
		this.alpha=alpha;
	}
	public double getCelcius() {
		return 5*(temper-32)/9;
	}
	public double getFahrenheit() {
		return 9*temper/5+32.0;
	}
	
	@Override
	public double getCelsius() {
		return 0;
	}
	@Override
	public void setCelsius(double celsius) {
	}
	@Override
	public void setFahrenheit(double fahrenheit) {
	}
}
