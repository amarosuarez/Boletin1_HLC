package ej06;

public class Ejercicio06 {
	
	public static double calculadora(double num1, double num2, int op) {
		double res = 0;
		
		if (op == 4 && num2 == 0) {
			throw new ArithmeticException("No puedes dividir por 0");
		} else {
			res = switch (op) {
			case 1 -> num1+num2;
			case 2 -> num1 - num2;
			case 3 -> num1 * num2;
			case 4 -> num1 / num2;
			default -> 0;
			};
		}
		
		return res;
	}
	
}
