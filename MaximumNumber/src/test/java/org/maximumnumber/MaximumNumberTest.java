package org.maximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
	// Refactor2
	@Test
	public void givenMaximumIntegerNumberAtFirst_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Integer> maxNumber = new MaximumNumber(25, 10, 15);
		Assert.assertEquals((Integer) 25, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumIntegerNumberAtSecond_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Integer> maxNumber = new MaximumNumber(22, 90, 15);
		Assert.assertEquals((Integer) 90, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumIntegerNumberAtThird_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Integer> maxNumber = new MaximumNumber(16, 22, 65);
		Assert.assertEquals((Integer) 65, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumFloatNumberAtFirst_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Float> maxNumber = new MaximumNumber(25.6f, 10.4f, 15.6f);
		Assert.assertEquals((Float) 25.6f, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumFloatNumberAtSecond_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Float> maxNumber = new MaximumNumber(22.9f, 90.1f, 15.45f);
		Assert.assertEquals((Float) 90.1f, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumFloatNumberAtThird_WhenAnalyse_ShouldReturnSameNumber() {
		MaximumNumber<Float> maxNumber = new MaximumNumber(16.6f, 22.3f, 65.7f);
		Assert.assertEquals((Float) 65.7f, maxNumber.testMaximum());
	}

	@Test
	public void givenMaximumStringWordAtFirst_WhenAnalyse_ShouldReturnSameWord() {
		MaximumNumber<Integer> maxWord = new MaximumNumber("peach", "apple", "banana");
		Assert.assertEquals("peach", maxWord.testMaximum());
	}

	@Test
	public void givenMaximumStringWordAtSecond_WhenAnalyse_ShouldReturnSameWord() {
		MaximumNumber<Integer> maxWord = new MaximumNumber("apple", "peach", "banana");
		Assert.assertEquals("peach", maxWord.testMaximum());
	}

	@Test
	public void givenMaximumStringWordAtThird_WhenAnalyse_ShouldReturnSameWord() {
		MaximumNumber<Integer> maxWord = new MaximumNumber("apple", "banana", "peach");
		Assert.assertEquals("peach", maxWord.testMaximum());
	}
}
