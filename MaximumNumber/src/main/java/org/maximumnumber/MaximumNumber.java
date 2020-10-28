package org.maximumnumber;

import java.util.*;

//uc4
public class MaximumNumber<E extends Comparable<E>> {

	List<E> numberList = new ArrayList<>();

	public MaximumNumber(E... parameters) {
		for (E values : parameters) {
			this.numberList.add(values);
		}
	}

	public E testMaximum() {

		printMax();
		return findMaximum(numberList);
	}

	// uc5
	private void printMax() {
		System.out.println("maximum from the list is : " + findMaximum(numberList));
	}

	public static <E extends Comparable<E>> E findMaximum(List<E> numberList) {

		try {
			return Collections.max(numberList);
		} catch (NoSuchElementException e) {
			return null;
		}

	}

}
