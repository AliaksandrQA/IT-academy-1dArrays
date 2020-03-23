package by.epam.course.array1d;

import java.util.Random;

/*  Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент 
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать*/

public class ArrayTask20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		System.out.println("Исходный массив");
		randomInit(arr);
		vanishElements(arr);
		System.out.println();
		System.out.println("Сжатый массив");
		print(arr);

	}

	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			System.out.print(mass[i] + " ");
		}  
	} 

	public static void vanishElements(int[] arr) {

		for (int i = 1; i < arr.length; i += 2) {
			arr[i] = 0;

		}
	}
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}