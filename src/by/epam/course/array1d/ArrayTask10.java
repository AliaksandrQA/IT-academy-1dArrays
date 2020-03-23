package by.epam.course.array1d;

/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. */

public class ArrayTask10 {

	public static void main(String[] args) {

		int[] mas = new int[] { -1, 34, 0, -4, -15, 22, 3, 4, 5 };
		
		calc(mas);

	}

	public static void calc(int mas[]) {
		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > i) {

				System.out.println( mas[i] +" " ) ;
			}
		}

	}
}