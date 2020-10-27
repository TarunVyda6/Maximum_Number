package org.maximumnumber;

//Refactor2
public class MaximumNumber<E extends Comparable<E>> {

	E firstWord, secondWord, thirdWord;

	public MaximumNumber(E firstWord, E secondWord, E thirdWord) {
		super();
		this.firstWord = firstWord;
		this.secondWord = secondWord;
		this.thirdWord = thirdWord;
	}

	public E testMaximum() {

		return findMaximum(firstWord, secondWord, thirdWord);
	}

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
