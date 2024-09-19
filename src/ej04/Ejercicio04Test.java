package ej04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio04Test {

	@Test
	void testEsPrimo2() {
		boolean res = Ejercicio04.esPrimo(2);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPrimo3() {
		boolean res = Ejercicio04.esPrimo(3);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPrimo5() {
		boolean res = Ejercicio04.esPrimo(5);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPrimo15() {
		boolean res = Ejercicio04.esPrimo(15);
		
		assertTrue(res);
	}

}
