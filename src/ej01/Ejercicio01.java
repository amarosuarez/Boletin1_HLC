package ej01;

public class Ejercicio01 {
	
	public static boolean esVocal(char caracter) {
		boolean res = false;
		
		res = switch (Character.toLowerCase(caracter)) {
		case 'a', 'e', 'i', 'o', 'u' -> true;
		default -> false;
		};
		
		return res;
	}
	
}
