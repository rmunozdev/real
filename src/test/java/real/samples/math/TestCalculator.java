package real.samples.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAddition() {
		Calculator calculator = new Calculator();
		assertEquals(9, calculator.add(8, 1));
	}
}
