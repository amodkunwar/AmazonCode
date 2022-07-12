package com.amazon.practice;

public class RemoveElement {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 2, 3 };
		int val = 3;
		int index = removeElement(arr, val);
		System.out.println(index);
	}

	/***
	 * remove the value from the array which is equal to value
	 * 
	 * @param arr
	 * @param val
	 * @return
	 */
	private static int removeElement(int[] arr, int val) {
		int index = 0;

		for (int i : arr) {
			if (i != val) {
				arr[index++] = i;
			}
		}
		return index;

	}
}
