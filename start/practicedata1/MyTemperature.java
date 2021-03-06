package practicedata1;

class MyTemperature implements temperature{
	double celsius;

	public MyTemperature(double value, String scale) {
		if(scale=="c") {
			setCelsius(value);
		}
		else {
			setFahrenheit(value);
		}
	}
	public double getCelsius() {
		return celsius;
	}
	public double getFahrenheit() {
		return 9*celsius/5+32.0;
	}
	public void setCelsius(double celcius) {
		this.celsius=celsius;
		System.out.println(celcius);
	}
	public void setFahrenheit(double Fahrenheit) {
		this.celsius=Fahrenheit;
	}

}
