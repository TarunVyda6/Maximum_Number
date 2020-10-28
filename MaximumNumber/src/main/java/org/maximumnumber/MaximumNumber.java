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

		return findMaximum(numberList);
	}

	public static <E extends Comparable<E>> E findMaximum(List<E> numberList) {

		try {
			return Collections.max(numberList);
		} catch (NoSuchElementException e) {
			return null;
		}

	}

}
