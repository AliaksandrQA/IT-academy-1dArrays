package by.epam.course.array1d;

import java.util.Random;

/* Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.*/

public class ArrayTask6 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		randomInit(arr);
		int minValue = minArr(arr);
		int maxValue = maxArr(arr);
		section(maxValue,minValue);
	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			//System.out.print(mass[i] + " ");
		}
	}

	public static int minArr(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		} return min;
	}

	public static int maxArr ( int [] arr) {
		
		int max = arr[0];
		for ( int i = 0; i < arr.length; i++) {
			
			
			if (max < arr[i]) {
				max = arr[i];
			}
		} return max;
		
		
	}

	public static void section(int max, int min) {
		int section;

		section = max - min;
		System.out.println("Наименьшую длина числовой оси = " +" "+ section );
	}

}