package by.epam.course.array1d;

/*В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. */

public class ArrayTask2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 2, 3, 0, 4, 5, 0, 0 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				count++;
			}
		}

		int[] mass = new int[count];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				mass[j] = i;
				j++;
			}
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i]+" ");
		}

	}
}