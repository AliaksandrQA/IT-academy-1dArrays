package by.epam.course.array1d;

import java.util.Random;

/*Даны действительные числа  a1,a2,...,a(2*n).
Найти max(a1 + a2 * n, a2 + a(2*n - 1),..., an + a(n+1)). */

public class ArrayTask16 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		
		int [] arr2 = new int [5];
		
		randomInit(arr,arr2);
		calc(arr2);
	}
	public static void randomInit(int[] arr, int [] arr2) {

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = arr[i] + arr[(arr.length - 1) - i];}
}
		
	public static void calc (int [] arr2) {
		int max;
		max = arr2[0];

		for (int i = 0; i < arr2.length; i++) {

			if (max < arr2[i]) {

				max = arr2[i];
			} 
		} 

		System.out.println("Значения массива ");

		for (int i = 0; i < arr2.length; i++) {

			System.out.print(arr2[i] +" ");
		}
	}
}
