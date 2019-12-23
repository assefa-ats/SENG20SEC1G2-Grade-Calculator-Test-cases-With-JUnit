package SENG20SEC1G2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GCalculatorTest {

	@Test
	public void testCal() {
		assertEquals("A", GCalculator.calculate(86) );
		assertEquals( "FX", GCalculator.calculate(37) );
		}

	public void testCalForScoreUnderZero() {
		assertEquals( "the score recieved is illegal", GCalculator.calculate(-5) );
		assertEquals("the score recieved is illegal", GCalculator.calculate(-78) );
		}
	public void testCalForScoreAboveHundred() {
		assertEquals("the score recieved is illegal", GCalculator.calculate(150) );
		assertEquals( "the score recieved is illegal", GCalculator.calculate(182) );
		}
}
