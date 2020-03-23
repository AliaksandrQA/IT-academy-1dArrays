package by.epam.course.array1d;

import java.util.Random;

/*Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
промежутке от L до N. */

public class ArrayTask13 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		randomInit(arr);
		int x = calc(arr);
		print(x);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(20);
			// System.out.print(mass[i] + " ");
		}
	}

	public static int calc(int[] arr) {

		int count, m, l, n;
		m = 5;
		l = 1;
		n = 50;
		count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < n && arr[i] > l) {

				if (arr[i] % m == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void print(int x) {

		System.out.println("Количество элементов кратных числу М и заключенных в\r\n" + 
				"промежутке от L до N = "+" "+ x);
	}
}
