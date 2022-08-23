import java.util.Scanner;

//Find the leaders in an array 
public class LeaderInArray {

	public static void main(String[] args) {

		int length;
		int[] array;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of the array: ");
		length = scan.nextInt();
		array = new int[length];

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		findLeaders(array);

	}

	public static void findLeaders(int[] array) {

		int temp, size, j = 1;
		int[] leaders;

		size = array.length;

		leaders = new int[size];
		leaders[0] = array[size - 1];
		temp = array[size - 1];

		for (int i = size - 2; i >= 0; i--) {
			if (array[i] > temp) {
				leaders[j++] = array[i];
				temp = array[i];
			}
		}
		System.out.print("The leaders are:");
		for (int i = 0; i < j; i++) {
			System.out.print(" " + leaders[i]);
		}

	}

}
