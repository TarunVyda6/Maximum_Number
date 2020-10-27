package org.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

	@Test
	public void givenMaximumNumberAtFirst_WhenAnalyse_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maximumNumber(25, 10, 15);
		Assert.assertEquals((Integer) 25, result);
	}

	@Test
	public void givenMaximumNumberAtSecond_WhenAnalyse_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maximumNumber(22, 90, 15);
		Assert.assertEquals((Integer) 90, result);
	}

	@Test
	public void givenMaximumNumberAtThird_WhenAnalyse_ShouldReturnSameNumber() {
		Integer result = MaximumNumber.maximumNumber(16, 22, 65);
		Assert.assertEquals((Integer) 65, result);
	}
}
