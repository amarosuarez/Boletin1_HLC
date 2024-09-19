package ej04;

public class Ejercicio04 {
	
	public static boolean esPrimo(int num) {
		boolean res = false;
		
		if (num == 2 || num%2 == 1) {
			res = true;
		}
		
		return res;
	}
	
}
