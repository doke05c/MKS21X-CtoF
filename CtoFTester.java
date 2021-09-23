class CtoFtester{
	static double celsiusToFahrenheit(double a) {
		double x = (a * 1.8 + 32);
		return x;
  }
	public static void main(String[] args) {
		double x = celsiusToFahrenheit(0);
		System.out.println(x);
	}
	
}
