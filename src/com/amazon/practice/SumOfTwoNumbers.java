package com.amazon.practice;

/**
 * SUM of two numbers which is equals to the target 
 */
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 11 };
		int target = 9;

		int[] finalArr = sumOfNumbers(arr, target);
		for (int a : finalArr) {
			System.out.println(a);
		}

	}

	private static int[] sumOfNumbers(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return null;
	}

}
