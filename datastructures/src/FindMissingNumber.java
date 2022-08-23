import java.util.Scanner;

//Find the missing number in an array
public class FindMissingNumber {

	public static void main(String[] args) {

		int length, sumExpect = 0, sumActual = 0;
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

		sumExpect = ((length + 1) * (length + 2)) / 2;

		for (int i : array) {
			sumActual = sumActual + i;
		}

		System.out.println("Expected sum is " + sumExpect);
		System.out.println("Actual sum is " + sumActual);
		System.out.println("The missing number is " + (sumExpect - sumActual));

	}

}
