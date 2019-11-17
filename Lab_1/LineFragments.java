package com.company;

import java.util.Arrays;
import java.util.Random;

class LineFragments {

	void task2() {

		StringBuilder str = new StringBuilder("aefddhfgrjkl");

		for (int i = 3; i < str.length(); i += 4)
		{
			str.insert(i, " ");
		}

		for (int i = 1; i < str.length(); i += 4)
		{
			do {
				Random rnd = new Random();
				char c = (char) (rnd.nextInt(26) + 'a');

				str.replace(i,i+1, String.valueOf(c));
			}

			while (str.charAt(i) == str.charAt(i - 1) || str.charAt(i) == str.charAt(i + 1));
		}
		System.out.println("После замены");
		System.out.println(str);

		String arrString = str.toString();
		char[] chArray = arrString.toCharArray();

		System.out.println("Sort");
		Arrays.sort(chArray);
		System.out.println(new String(chArray).trim());
		System.out.print("\n");
	}
}
