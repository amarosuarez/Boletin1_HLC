package ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio05Test {

	@Test
	void testEsCapicua1() {
		boolean res = Ejercicio05.esCapicua(1);
		
		assertTrue(res);
	}

	@Test
	void testEsCapicua2() {
		boolean res = Ejercicio05.esCapicua(2);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua3() {
		boolean res = Ejercicio05.esCapicua(3);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua11() {
		boolean res = Ejercicio05.esCapicua(11);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua22() {
		boolean res = Ejercicio05.esCapicua(22);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua33() {
		boolean res = Ejercicio05.esCapicua(33);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua44() {
		boolean res = Ejercicio05.esCapicua(44);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua101() {
		boolean res = Ejercicio05.esCapicua(101);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua121() {
		boolean res = Ejercicio05.esCapicua(121);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua202() {
		boolean res = Ejercicio05.esCapicua(202);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua1221() {
		boolean res = Ejercicio05.esCapicua(1221);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua12321() {
		boolean res = Ejercicio05.esCapicua(1221);
		
		assertTrue(res);
	}
	
	@Test
	void testEsCapicua122115() {
		boolean res = Ejercicio05.esCapicua(122115);
		
		assertFalse(res);
	}
	
	@Test
	void testEsCapicua_11() {
		boolean res = Ejercicio05.esCapicua(-11);
		
		assertFalse(res);
	}
	
	@Test
	void testEsCapicua0() {
		boolean res = Ejercicio05.esCapicua(0);
		
		assertTrue(res);
	}
	
}
