package by.epam.course.array1d;

import java.util.Random;

/* Дана последовательность действительных чисел a1,a2,...,an . 
Указать те ее элементы, которые принадлежат отрезку [с, d]. */

public class ArrayTask15 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		randomInit(arr);
		calc(arr);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
	}

	public static void calc(int[] arr) {
		int c = 2;
		int d = 4;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= d && arr[i] >= c) {
				System.out.println(arr[i]);
			}
		}
	}
}