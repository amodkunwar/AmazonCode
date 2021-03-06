package com.amazon.practice;

import java.util.Scanner;
/***
 * Write a program to check if a number is power of two or not.
 * @author Amod
 *
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nmmber");
		int num = scan.nextInt();
		System.out.println(isPowerOfTwo(num));
		scan.close();
	}

	private static boolean isPowerOfTwo(int num) {
		long i = 1;
		while (i < num) {
			i *= 2;
		}
		return i == num;
	}
}
