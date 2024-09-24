package ej04;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ejercicio04Test {

	@Test
	void testEsPrimo0() {
		boolean res = Ejercicio04.esPrimo(0);
		
		assertFalse(res);
	}
	
	@Test
	void testEsPrimo1() {
		boolean res = Ejercicio04.esPrimo(1);
		
		assertFalse(res);
	}
	
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
	void testEsPrimo9() {
		boolean res = Ejercicio04.esPrimo(15);
		
		assertFalse(res);
	}
	
	@Test
	void testEsPrimo15() {
		boolean res = Ejercicio04.esPrimo(15);
		
		assertFalse(res);
	}

}
