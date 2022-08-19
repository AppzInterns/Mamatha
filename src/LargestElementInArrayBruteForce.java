import java.util.Scanner;

//Find the largest element in an array using Brute Force and O(n)
public class LargestElementInArrayBruteForce {

	public static void main(String[] args) {
		int length;
		int[] array;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		length = scan.nextInt();

		array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();

		}

		scan.close();
		findLargest(array);
	}

	public static void findLargest(int[] array) {
		int temp, i;
		temp = array[0];

		for (i = 1; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}
		System.out.println("The largest element in the array is " + temp);
	}

}
