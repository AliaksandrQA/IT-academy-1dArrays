package by.epam.course.array1d;

/* Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

public class ArrayTask9 {

	public static void main(String[] args) {

		int[] arr = { 3, 2 , -3, 100, 25, 39 , - 35, 12, 9 };

		int minIndex = findMin(arr);
		int maxIndex = findMax(arr);
		

		int minValue = arr[findMin(arr)];

		System.out.println(maxIndex);
		System.out.println(minIndex);

		arr[minIndex] = arr[maxIndex];

		arr[maxIndex] = minValue;

		printArray(arr);
	}

	public static int findMin(int[] mas) {
		int min = 0;
		int minIndex = 0;

		for (int i = 0; i < mas.length; i++) {

			if (min > mas[i]) {

				min = mas[i];

				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int findMax(int[] mas) {

		int max = 0;
		int maxIndex = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {

				max = mas[i];

				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}