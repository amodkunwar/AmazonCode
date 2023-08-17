package com.amazon.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindDuplicatesFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 3, 5, 5, 6, 3 };
		List<Integer> lst = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]) - 1;
			if (arr[index] < 0) {
				lst.add(arr[index + 1]);
			}
			if (arr[index] > 0)
				arr[index] = -arr[index];
		}
		Arrays.stream(arr).boxed().toList().forEach(s -> System.out.println(s));
		System.out.println("List is " + lst);

		List<Integer> asList = Arrays.stream(arr).boxed().toList();
		System.out.println(asList);

	}

}
