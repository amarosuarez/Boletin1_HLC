package ej07;

import java.time.Year;

public class Ejercicio07 {
	
	public static boolean fechaCorrecta(int dia, int mes, int anyo) {
		boolean res = false;
		
		if (anyo > 0) {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				res = dia > 0 && dia <= 31;
				break;
			case 4, 6, 9, 11:
				res = dia > 0 && dia < 31;
				break;
			case 2:
				int maxDay = 28;
				
				if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
					maxDay = 29;
				}
				
				res = dia > 0 && dia <= maxDay;
				break;
			} 
		}
		
		return res;
	}
	
}
