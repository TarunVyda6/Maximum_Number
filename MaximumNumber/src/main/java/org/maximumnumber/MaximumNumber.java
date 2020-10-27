package org.maximumnumber;

public class MaximumNumber {

	// uc1
	public static Integer maximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		return maxNumber;
	}

	// uc2
	public static Float maximumNumber(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maxNumber = firstNumber;
		if (secondNumber.compareTo(maxNumber) > 0) {
			maxNumber = secondNumber;
		}
		if (thirdNumber.compareTo(maxNumber) > 0) {
			maxNumber = thirdNumber;
		}
		return maxNumber;
	}

	// uc3
	public static String maximumWord(String firstWord, String secondWord, String thirdWord) {
		String maxWord = firstWord;
		if (secondWord.compareTo(maxWord) > 0) {
			maxWord = secondWord;
		}
		if (thirdWord.compareTo(maxWord) > 0) {
			maxWord = thirdWord;
		}
		return maxWord;
	}
}
