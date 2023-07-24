package com.amazon.practice;

public class ReverseTheVowel {

	public static void main(String[] args) {
		String solution = "hello";
		solution = revserTheVowel(solution);
		System.out.println(solution);
	}

	private static String revserTheVowel(String solution) {
		char[] charArray = solution.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			boolean isLeftVowel = isVowel(charArray[left]);
			boolean isRightVowel = isVowel(charArray[right]);
			if (isLeftVowel && isRightVowel) {
				swap(charArray, left, right);
				++left;
				--right;
			}
			if (!isLeftVowel) {
				++left;
			}
			if (!isRightVowel) {
				--right;
			}
		}
		return new String(charArray);
	}

	private static boolean isVowel(char ch) {
		char c = Character.toLowerCase(ch);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

}
