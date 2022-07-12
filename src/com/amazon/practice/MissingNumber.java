package com.amazon.practice;

import java.util.HashSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 2 };
//		int missingNumber = findMissingNumber(arr);
		int missingNumber = findMissingNumberUsingGuageRule(arr);
		System.out.println(missingNumber);

	}
	
	/**
	 * using guage rule
	 * @param arr
	 * @return
	 */

	private static int findMissingNumberUsingGuageRule(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}

		int n = arr.length;

		return (n * (n - 1)) - sum;
	}

	/***
	 * Using hashset and for loop
	 * 
	 * @param arr
	 * @return
	 */

	private static int findMissingNumber(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : arr) {
			hashSet.add(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!hashSet.contains(i)) {
				return i;
			}
		}

		return -1;
	}
}
