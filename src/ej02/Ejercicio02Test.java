package ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {

	@Test
	void testEsPar2() {
		boolean res = Ejercicio02.esPar(2);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPar4() {
		boolean res = Ejercicio02.esPar(4);
		
		assertTrue(res);
	}
	
	@Test
	void testEsPar5() {
		boolean res = Ejercicio02.esPar(5);
		
		assertFalse(res);
	}

}
