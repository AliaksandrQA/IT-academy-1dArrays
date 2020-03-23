package by.epam.course.array1d;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов. */

public class ArrayTask8 {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 2, -3, 0, 14, -2, -3, 0, 4 };

		negativeArr(arr);

		positiveArr(arr);

		zeroArr(arr);

	}

	public static void negativeArr(int arr[]) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				count++;
			}
		}
		System.out.println("отрицательных элементов" + " " + count);

	}

	public static void positiveArr(int arr[]) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				count++;
			}
		}
		System.out.println("положительных элементов" + " " + count);
	}

	public static void zeroArr(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				count++;
			}
		}
		System.out.println("нулевых элементов" + " " + count);

	}
}