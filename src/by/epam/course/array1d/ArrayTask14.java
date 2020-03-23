package by.epam.course.array1d;

import java.util.Random;

/* Дан одномерный массив A[N]. Найти:max( , , , ) min( , , , ) */

public class ArrayTask14 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		randomInit(arr);

		int maxVAlue = maxVal(arr);
		int mincValue = minVal(arr);
		print(maxVAlue,mincValue);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
	}

	public static int maxVal(int[] arr) {
		int max;
		max = arr[0];

		for (int i = 1; i < arr.length; i = i + 2) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}
		return max;
	}
	public static int minVal(int[] arr) {
		int min;
		min = arr[0];

		for (int i = 1; i < arr.length; i = i + 2) {

			if (arr[i] < min) {

				min = arr[i];

			}

		}
		return min;
}
	public static void print(int x, int y) {
		
		System.out.println("Сумма = "+" "+ x + y);
	}
	
}