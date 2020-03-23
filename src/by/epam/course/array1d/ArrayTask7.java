package by.epam.course.array1d;

import java.util.Random;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен. */

public class ArrayTask7 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		int z;
		z = 4;

		randomInit(arr);

		int changedigit = change(arr, z);

		print(changedigit);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
	}

	public static int change(int[] arr, int z) {
		int count = 0;

		for (int i = 0; i < arr.length; i++)
			if (arr[i] > z) {

				arr[i] = z;

				count++;
			}
		return count;
	}

	public static void print(int a) {

		System.out.println("Количесво замен = " + " " + a);
	}

}