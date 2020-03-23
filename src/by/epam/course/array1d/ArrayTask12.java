package by.epam.course.array1d;

import java.util.Random;

/* Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
простыми числами.*/

public class ArrayTask12 {

	public static void main(String[] args) {

		double[] arr = new double[20];

		randomInit(arr);
		sumCount(arr);
	}

	public static void randomInit(double[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(20);
			// System.out.print(mass[i] + " ");
		}
	}

	public static void sumCount(double[] arr) {
		
		int temp;
		double sum = 0;

		for (int i = 1; i <= arr.length; i++) {
			
			boolean Simple = true;
			
			for (int j = 2; j <= i / 2; j++) {

				temp = i % j;

				if (temp == 0) {

					Simple = false;

				}
			}

			if (Simple) {

				System.out.println(i + " - номер ячейки простое число");
				sum = sum + arr[i];
				
			} 
			
	} System.out.println("сумма чисел ="+" "+ sum);
}
}