package by.epam.course.array1d;

import java.util.Random;

/*Дана последовательность целых чисел  a1,a2,...,an. 
Образовать новую последовательность, выбросив из исходной 
те члены, которые равны  min(a1,a2,...,an). */

public class ArrayTask17 {

	public static void main(String[] args) {
		int[] arr = new int[10];

		int[] mas = new int[10];

		randomInit(arr);

		int findMin = minValue(arr);

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != findMin) {
				mas[j] = arr[i];
				j++;
			}
		}
		
		print(mas);
	}

	public static void randomInit(int[] arr) {

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
	}

	public static int minValue(int[] arr) {

		int min = arr[0];

		for (int i = 0; i > arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}