package com.amazon.practice;

/***
 * 
 * @author Amod Kunwar
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 9;

		boolean b = isPrimeNumber(num);
		System.out.println(b);
	}

	private static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
