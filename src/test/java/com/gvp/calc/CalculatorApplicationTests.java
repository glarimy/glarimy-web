package com.gvp.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void testSqaure(){
		Square square = new Square();
		int result = square.findSquareOf(4);
		assertEquals(16, result, "Incorrect square");
	}
}
