package org.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	// Tc1.1
	@Test
	public void givenMaximumIntegerNumberAtFirst_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Integer) 25, MaximumNumber.maximumNumber(25, 10, 15));
	}

	// Tc1.2
	@Test
	public void givenMaximumIntegerNumberAtSecond_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Integer) 90, MaximumNumber.maximumNumber(22, 90, 15));
	}

	// Tc1.3
	@Test
	public void givenMaximumIntegerNumberAtThird_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Integer) 65, MaximumNumber.maximumNumber(16, 22, 65));
	}

	// Tc2.1
	@Test
	public void givenMaximumFloatNumberAtFirst_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Float) 25.6f, MaximumNumber.maximumNumber(25.6f, 10.4f, 15.6f));
	}

	// Tc2.2
	@Test
	public void givenMaximumFloatNumberAtSecond_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Float) 90.1f, MaximumNumber.maximumNumber(22.9f, 90.1f, 15.4f));
	}

	// Tc2.3
	@Test
	public void givenMaximumFloatNumberAtThird_WhenAnalyse_ShouldReturnSameNumber() {
		Assert.assertEquals((Float) 65.7f, MaximumNumber.maximumNumber(16.6f, 22.3f, 65.7f));
	}
}
