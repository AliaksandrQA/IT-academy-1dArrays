package by.epam.course.array1d;

import java.util.Random;

/*Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте. */

public class ArrayTask5 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		randomInit(arr);

		int count = even(arr);

		sequence(count, arr);
		
		print(arr);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}

	}

	public static int even(int[] mass) {

		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public static void sequence(int count, int[] arr) {

		int j = 0;
		int[] b = new int[count];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				b[j] = arr[i];
				j = j + 1;
			}
		}
		
	}
	
	public static void print (int[] b) {
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] +" ");
	}
}
}