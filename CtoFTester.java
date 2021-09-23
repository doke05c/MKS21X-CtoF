class CtoFtester{
	static double celsiusToFahrenheit(double a) {
		double x = (a * 1.8 + 32);
		return x;
  }
 
 	static double fahrenheitToCelsius(double b) {
		double y = ((b - 32) / 1.8);
		return y;
  }
 
	public static void main(String[] args) {
		double x = celsiusToFahrenheit(0);
		double y = fahrenheitToCelsius(32);
		System.out.println(x);
		System.out.println(y);
	}
	
}
