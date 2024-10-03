package ej05;

public class Ejercicio05 {
	
	public static boolean esCapicua(int num) {		
//		int n;
//		int n2;
//		
//		if (num<10) {
//			res = true;
//		} else if (num > 10 && num < 100) {
//			n = num/10;
//			n2 = num%10;
//			
//			res = n == n2;
//		} else if (num == 101 || num == 121) {
//			res = true;
//		}
		
		int original = num;
		int ultimo = 0;
		int invertido = 0;
		
		// Ejemplo 101
		while (num > 0) {
			// Cojo el último 1
			// Coge el 0
			// Coge 1
			ultimo = num%10;
			
			// 0 * 10 + 1 = 1
			// 1 * 10 + 0 = 10
			// 10 * 10 + 1 = 101
			invertido = invertido * 10 + ultimo;
			
			// 101 -> 10
			// 10 -> 1
			// 10 -> 0
			num /= 10;
		}
		
		return original == invertido;
	}
	
}
