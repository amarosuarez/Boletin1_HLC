package ej08;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Ejercicio08Test {

	@ParameterizedTest
	@MethodSource("datos")
	void testFibo(long num, long resEsperado) throws Exception {
		long resObtenido = Ejercicio08.fibo(num);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	private static Stream<Arguments> datos() {
		return Stream.of(
			Arguments.of(1, 1),
			Arguments.of(3, 2),
			Arguments.of(5, 5),
			Arguments.of(8, 21),
			Arguments.of(12, 144),
			Arguments.of(20, 6765),
			Arguments.of(30, 832040),
			Arguments.of(40, 102334155)
		);
	}

	@Test
    void testFiboExcep() throws Exception {
    	Exception exception = assertThrows(Exception.class, () ->
        Ejercicio08.fibo(0));

    	assertEquals("No puede ser menor que 0", exception.getMessage());
    }
}
