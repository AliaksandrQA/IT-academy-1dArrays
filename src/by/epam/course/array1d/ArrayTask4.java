package by.epam.course.array1d;

import java.util.Random;

/*Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. */

public class ArrayTask4 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		randomInit(arr);
		findIncrease(arr);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
	}

	public static void findIncrease(int[] mass) {

		for (int i = 0; i < mass.length - 1; i++) {
			if (mass[i] > mass[i + 1]) {
				System.out.println("Последовательность убывающая");
				break;
			}
			if (i == mass.length - 1) {
				System.out.println("Последовательность возрастающая");
			}
		}
	}

}