package ej01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio01Test {

	@ParameterizedTest
	@MethodSource("vocalista")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resObtenido = Ejercicio01.esVocal(caracter);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	private static Stream<Arguments> vocalista() {
		return Stream.of(
			Arguments.of('a', true),
			Arguments.of('E', true),
			Arguments.of('i', true),
			Arguments.of('O', true),
			Arguments.of('u', true),
			Arguments.of('X', false)
		);
	}
	
	@Test
	void testEsVocalAMinuscula() {
		boolean result = Ejercicio01.esVocal('a');

		assertTrue(result);
	}

	@Test
	void testEsVocalAMayuscula() {
		boolean result = Ejercicio01.esVocal('A');

		assertTrue(result);
	}

	@Test
	void testEsVocalEMinuscula() {
		boolean result = Ejercicio01.esVocal('e');

		assertTrue(result);
	}

	@Test
	void testEsVocalEMayuscula() {
		boolean result = Ejercicio01.esVocal('E');

		assertTrue(result);
	}

	@Test
	void testEsVocalIMinuscula() {
		boolean result = Ejercicio01.esVocal('i');

		assertTrue(result);
	}

	@Test
	void testEsVocalOMinuscula() {
		boolean result = Ejercicio01.esVocal('o');

		assertTrue(result);
	}

	@Test
	void testEsVocalUMinuscula() {
		boolean result = Ejercicio01.esVocal('u');

		assertTrue(result);
	}

	@Test
	void testEsVocalConsonante() {
		boolean result = Ejercicio01.esVocal('p');

		assertFalse(result);
	}

}