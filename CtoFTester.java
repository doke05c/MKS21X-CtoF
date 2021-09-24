// Some thoughts.
/* Q: What should the functions have as parameter(s)? 
 A: The parameters should be variables with the initial temperature (one variable). I used a and b for c-> F and f -> C respectively. 
 Babied by codingbat i suppose. otherwise i guess it was simple.) 
 Q: What type should they be? 
 A: Since temperatures come in all messed up forms, I went with double. Unless I want some futuristic near absolute zero degree to say 
 0.0000000000000000000000000000000000000000012312893781293712, doubles work just fine for me thanks.
 Q: What should the functions return? 
 A: Probably the equivalent value in the other temperature? cToF(0) should give 32, fToC(98.6) should give 37, etc.....
	end of humor */ 

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
		double z = fahrenheitToCelsius(98.6);
		double a = celsiusToFahrenheit(100.0000001);
		double b = celsiusToFahrenheit(173.88888);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
	}
	
}


 