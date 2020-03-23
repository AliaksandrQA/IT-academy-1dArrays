package by.epam.course.array1d;

import java.util.Random;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них. */

public class ArrayTask19 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		randomInit(arr);
		int[] x = findDigit(arr);
		

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			System.out.print(mass[i] + " ");
		}
	}

	public static int[] findDigit(int[] mas) {

		int[] temp = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				if (mas[i] == mas[j]) {

					temp[i] = temp[i] + 1;
				}
					
			}
		}
		return temp;
	}
}
