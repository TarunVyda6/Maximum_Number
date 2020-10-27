package org.maximumnumber;

public class MaximumNumber {

	// Refactor1
	public static <E extends Comparable<E>> E findMaximum(E firstWord, E secondWord, E thirdWord) {

		E maxWord = firstWord;
		if (secondWord.compareTo(maxWord) > 0) {
			maxWord = secondWord;
		}
		if (thirdWord.compareTo(maxWord) > 0) {
			maxWord = thirdWord;
		}
		return maxWord;
	}

}
