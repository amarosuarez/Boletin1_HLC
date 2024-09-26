package ej06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio06Test {

	/*
	 * Sum -> 1
	 * Res -> 2
	 * Mult -> 3
	 * Div -> 4
	 */
	
	@ParameterizedTest
	@MethodSource("datos")
	void testCalculadora(double num1, double num2, int op, double resEsperado) throws Exception {
		double resObtenido = Ejercicio06.calculadora(num1, num2, op);
		
		assertEquals(resEsperado, resObtenido);
	}
	
	private static Stream<Arguments> datos() {
		return Stream.of(
			Arguments.of(1, 1, 1, 2),
			Arguments.of(10, 24, 1, 34),
			Arguments.of(10, 2, 2, 8),
			Arguments.of(40, 20, 2, 20),
			Arguments.of(2, 3, 3, 6),
			Arguments.of(20, 47, 3, 940),
			Arguments.of(10, 2, 4, 5)
		);
	}
	
//	@Test
//	void testCalculadora1_1_S() {
//		double res = Ejercicio06.calculadora(1, 1, 1);
//		
//		assertEquals(2, res);
//	}
//	
//	@Test
//	void testCalculadora10_24_S() {
//		double res = Ejercicio06.calculadora(10, 24, 1);
//		
//		assertEquals(34, res);
//	}
	
//	@Test
//	void testCalculadora10_2_R() {
//		double res = Ejercicio06.calculadora(10, 2, 2);
//		
//		assertEquals(8, res);
//	}
//	
//	@Test
//	void testCalculadora40_20_R() {
//		double res = Ejercicio06.calculadora(40, 20, 2);
//		
//		assertEquals(20, res);
//	}
	
//	@Test
//	void testCalculadora2_3_M() {
//		double res = Ejercicio06.calculadora(2, 3, 3);
//		
//		assertEquals(6, res);
//	}
	
//	@Test
//	void testCalculadora20_47_M() {
//		double res = Ejercicio06.calculadora(20, 47, 3);
//		
//		assertEquals(940, res);
//	}
	
//	@Test
//	void testCalculadora10_2_D() {
//		double res = Ejercicio06.calculadora(10, 2, 4);
//		
//		assertEquals(5, res);
//	}
	
    @Test
	void testCalculadora10_0_D() throws Exception {
    	double res = Ejercicio06.calculadora(10, 0, 4);
    	
    	assertTrue(Double.isInfinite(res));
	}
    
    @Test
    void testCalculadoraNoOption() throws Exception {
    	Exception exception = assertThrows(Exception.class, () ->
        Ejercicio06.calculadora(1, 0, 8));

    	assertEquals("Esa opción no existe", exception.getMessage());
    }

}
