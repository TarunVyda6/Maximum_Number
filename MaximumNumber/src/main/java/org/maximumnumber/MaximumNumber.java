package org.maximumnumber;

public class MaximumNumber {

	// uc1
	public static Integer maximumNumber(Integer a, Integer b, Integer c) {
		Integer maxNumber = a;
		if (b.compareTo(maxNumber) > 0) {
			maxNumber = b;
		}
		if (c.compareTo(maxNumber) > 0) {
			maxNumber = c;
		}
		return maxNumber;
	}

}
