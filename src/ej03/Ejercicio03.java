package ej03;

public class Ejercicio03 {
	
	public static String devuelveFrase(int num) {
		String res = "";
		
		if (num%3 == 0 && num%5 == 0) {
			res = "fizzbuzz";
		} else if (num%3 == 0) {
			res = "fizz";
		} else if (num%5 == 0) {
			res = "buzz";
		}
		
		return res;
	}
	
}
