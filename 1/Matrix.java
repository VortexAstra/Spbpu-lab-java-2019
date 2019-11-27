package com.company;

import java.util.Scanner;

class Matrix {
	void task1() throws ExceptionInInitializerError {
		try {
			System.out.println("Введите число строк");
			final int str = new Scanner(System.in).nextInt();

			System.out.println("Введите число столбцов");
			final int rows = new Scanner(System.in).nextInt();

			int[][] arr = new int[str][rows];

			int counter = 0;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (str == counter) {
						arr[i][j] = 0;
						break;
					}
					arr[i][j] = 1;
					counter++;
				}
			}

			for (final int[] anArr : arr) {
				for (final int anAnArr : anArr) {
					System.out.print(anAnArr + " ");
				}
				System.out.println();
			}

		} catch (ExceptionInInitializerError e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
