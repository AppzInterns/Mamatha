import java.util.Scanner;

public class FindMaxDifference {

	public static void main(String[] args) {

		int length, maxDiff = 0;
		int[] array;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		length = scan.nextInt();
		array = new int[length];

		System.out.println("Enter the elements in array: ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < length; j++) {
				if ((array[i] - array[j]) > maxDiff) {
					maxDiff = array[i] - array[j];
				}
			}
		}
		System.out.println("The max difference is: " + maxDiff);
	}

}
