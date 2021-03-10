package classready;

public class MyTemperature implements Temperature{
	private double celcius;
	
	MyTemperature(double Value, char Scale){
		if(Scale == 'C') {
			setCelcius(Value);
		}
		else {
			setFahrenheit(Value);
		}
	}
	public double getCelcius() {
		return 5*(celcius-32)/9;
	}
	public double getFahrenheit() {
		return 9*celcius/5+32.0;
	}
	public void setCelcius(double celcius) {
		this.celcius=celcius;
	}
	public void setFahrenheit(double fahrenheit) {
		this.celcius=fahrenheit;
	}
}
