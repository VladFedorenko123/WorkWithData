package src.srccode.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.srccode.data.ConsonantCalculator;

class ConsonantCalculatorTest {
	ConsonantCalculator objectUnderTest = new ConsonantCalculator();

	@Test
	void testGetConsonant() {
		assertEquals(3, objectUnderTest.getConsonant("vlad"));
		assertEquals(3, objectUnderTest.getConsonant("sasha"));
		assertEquals(6, objectUnderTest.getConsonant("vlodmyr"));
	}

}
