package by.epam.course.array1d;

import java.util.Random;

/*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. */

public class ArrayTask1 {

	public static void main(String[] args) {
		
		int n;
		int sum;
		
		n = 9;
		int [] arr = new int [n];
		
		sum = 0;
		
		arrIninit(arr);
		sum = Crat(arr);
		System.out.println(sum);	
}

	public static void arrIninit ( int [] arr) { // рандомная инициализация
		
		Random random = new Random();
		
		for ( int i = 0; i <arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
	} 
	
	
	public static int Crat( int [] arr) { // нахождение кратного из рандомно инициализированного массива
		int sum = 0;
		int k = 2;
		for ( int i = 0; i < arr.length; i++) {
			if(arr[i] % k == 0) {
				sum = sum + arr[i];
			}
		} return sum;
		
	
	}
}





