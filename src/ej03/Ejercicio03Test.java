package ej03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio03Test {

	@ParameterizedTest
	@MethodSource("devuelve")
	void testDevuelveFrase(int num, String expected) {
		String res = Ejercicio03.devuelveFrase(num);
		
		assertEquals(expected, res);
	}
	
	private static Stream<Arguments> devuelve() {
		return Stream.of(
			Arguments.of(3, "fizz"),
			Arguments.of(5, "buzz"),
			Arguments.of(6, "fizz"),
			Arguments.of(10, "buzz"),
			Arguments.of(15, "fizzbuzz"),
			Arguments.of(2, "")
		);
	}

}
