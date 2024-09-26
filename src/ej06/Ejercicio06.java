package ej06;

public class Ejercicio06 {
	
	public static double calculadora(double num1, double num2, int op) throws Exception {
		double res = 0;
		
		res = switch (op) {
		case 1 -> num1+num2;
		case 2 -> num1 - num2;
		case 3 -> num1 * num2;
		case 4 -> num1 / num2;
		default -> throw new Exception("Esa opción no existe");
		};
		
		return res;
	}
	
}
