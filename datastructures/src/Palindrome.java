import java.util.Scanner;

//Find if a given string is a palindrome
public class Palindrome {

	public static void main(String[] args) {

		String str, reverseStr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = scan.next();
		scan.close();

		reverseStr = reverseString(str);

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println("The string " + str + " is a palindrome");
		} else
			System.out.println("The string " + str + " is not a palindrome");

	}

	public static String reverseString(String input) {
		String reverse;
		if (input.isEmpty())
			return input;
		else
			reverse = reverseString(input.substring(1)) + input.charAt(0);

		return reverse;
	}

}
