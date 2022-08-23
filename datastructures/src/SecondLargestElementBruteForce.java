import java.util.Scanner;

public class SecondLargestElementBruteForce {

	public static void main(String[] args) {

		int length, first = 0, second = 0;
		int[] array;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of the array: ");
		length = scan.nextInt();
		array = new int[length];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		if (array[0] > array[1]) {
			first = array[0];
			second = array[1];
		} else if (array[1] > array[0]) {
			first = array[1];
			second = array[0];
		}

		for (int i = 2; i < length; i++) {
			if (array[i] > first) {
				second = first;
				first = array[i];

			} else if ((array[i] > second) && (array[i] != first))
				second = array[i];
		}
		if (second == 0)
			System.out.println("All elements are the same integer.");
		else
			System.out.println("The second largest element is: " + second);

	}

}
