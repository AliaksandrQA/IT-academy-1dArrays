package by.epam.course.array1d;

import java.util.Random;

/*Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). */

public class ArrayTask11 {

	public static void main(String[] args) {
		
		int [] arr = new int [10];
		
		int m, l;
		
		m = 7;
		l = 2;
		
		randomInit(arr);
		division(arr, m);


	}
	public static void randomInit(int[] mass) {

		Random random = new Random();
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(10);
			// System.out.print(mass[i] + " ");
		}
}
	public static void division(int [] arr, int m) {
		
		for ( int i  = 0; i <arr.length; i++) {
			if(arr[i] % m == 1) {
				System.out.println(arr[i]);
			}
		}
	}
	
}