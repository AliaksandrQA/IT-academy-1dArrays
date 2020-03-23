package by.epam.course.array1d;

import java.util.Random;

/* Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
отрицательное.*/

public class ArrayTask3 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		randomInit(arr);
		findPosNeg(arr);
	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			//System.out.print(mass[i] + " ");
		}

	}

	public static void findPosNeg(int[] mass) {

		if (mass[0] >= 0) {
			System.out.println("Положительное");
		} else {
			System.out.println("Отрицательное");
		}

	}

}
