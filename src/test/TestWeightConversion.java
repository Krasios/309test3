package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logic.WeightConversion;

public class TestWeightConversion {
	@Test
	public void testKilosToPoundsOk() {
		WeightConversion uut = new WeightConversion();
		double i = 0.454;
		double result = uut.KilosToPounds(i);
		assertEquals(1,result,0);
	}
	@Test
	public void testPoundsToKilosOk() {
		WeightConversion uut = new WeightConversion();
		double i = 1;
		double result = uut.PoundsToKilos(i);
		assertEquals(0.454,result,0);
	}
}
