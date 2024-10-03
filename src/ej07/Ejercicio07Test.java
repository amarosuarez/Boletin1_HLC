package ej07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import ej01.Ejercicio01;

class Ejercicio07Test {

	@ParameterizedTest
	@MethodSource("fechas")
	void testFechaCorrecta(int day, int month, int year, boolean resEsperado) {
		boolean resObtenido = Ejercicio07.fechaCorrecta(day, month, year);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	@ParameterizedTest
	@MethodSource("fechasBisiestas")
	void testFechaCorrectaBisiesta(int day, int month, int year, boolean resEsperado) {
		boolean resObtenido = Ejercicio07.fechaCorrecta(day, month, year);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	private static Stream<Arguments> fechas() {
		return Stream.of(
			Arguments.of(31, 1, 2001, true),
			Arguments.of(31, 3, 2001, true),
			Arguments.of(31, 8, 2001, true),
			Arguments.of(30, 4, 2001, true),
			Arguments.of(10, 4, 2001, true),
			Arguments.of(6, 2, 2001, true),
			Arguments.of(22, 7, 2001, true),
			Arguments.of(30, 6, 2001, true),
			Arguments.of(28, 2, 2001, true),
			Arguments.of(29, 2, 2024, true),
			Arguments.of(30, 2, 2024, false),
			Arguments.of(30, 2, -2024, false),
			Arguments.of(-10, 5, 2022, false),
			Arguments.of(19, -7, 2022, false),
			Arguments.of(-13, -7, -2010, false),
			Arguments.of(12, 5, -2023, false)
		);
	}
	
	// Bisiestos
	private static Stream<Arguments> fechasBisiestas() {
		return Stream.of(
			Arguments.of(29, 2, 1976, true),
			Arguments.of(29, 2, 1980, true),
			Arguments.of(29, 2, 1984, true),
			Arguments.of(29, 2, 1988, true),
			Arguments.of(29, 2, 1992, true),
			Arguments.of(29, 2, 1996, true),
			Arguments.of(29, 2, 2000, true),
			Arguments.of(29, 2, 2004, true),
			Arguments.of(29, 2, 2008, true),
			Arguments.of(29, 2, 2012, true),
			Arguments.of(29, 2, 2016, true),
			Arguments.of(29, 2, 2020, true),
			Arguments.of(29, 2, 2024, true),
			Arguments.of(29, 2, 2028, true),
			Arguments.of(29, 2, 2032, true),
			Arguments.of(29, 2, 2076, true)
		);
	}
	
//	@Test
//	void testFechaCorrecta31_1_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(31, 1, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta31_3_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(31, 3, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta31_8_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(31, 8, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta30_4_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(30, 4, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta30_6_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(30, 6, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta28_2_2001() {
//		boolean res = Ejercicio07.fechaCorrecta(28, 2, 2001);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta29_2_2024() {
//		boolean res = Ejercicio07.fechaCorrecta(29, 2, 2024);
//		
//		assertTrue(res);
//	}
//	
//	@Test
//	void testFechaCorrecta30_2_2024() {
//		boolean res = Ejercicio07.fechaCorrecta(30, 2, 2024);
//		
//		assertFalse(res);
//	}
//	
//	@Test
//	void testFechaCorrecta30_2_menos2024() {
//		boolean res = Ejercicio07.fechaCorrecta(30, 2, -2024);
//		
//		assertFalse(res);
//	}
	
}
