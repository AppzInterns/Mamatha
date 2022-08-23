import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find if two strings are anagrams
public class AnagramStrings {

	public static void main(String[] args) {
		String str1, str2;
		Map<Character, Integer> str1Map, str2Map;
		char[] str1CharArray, str2CharArray;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string: ");
		str1 = scan.next();
		System.out.println("Enter second string: ");
		str2 = scan.next();
		scan.close();

		if (str1.length() != str2.length()) {
			System.out.println("These strings are not anagrams.");
			return;
		}
		str1CharArray = str1.toCharArray();
		str2CharArray = str2.toCharArray();

		str1Map = new HashMap<Character, Integer>();
		str2Map = new HashMap<Character, Integer>();

		for (char c : str1CharArray) {

			if (str1Map.containsKey(c)) {
				str1Map.put(c, str1Map.get(c) + 1);

			} else
				str1Map.put(c, 1);
		}

		for (char c : str2CharArray) {

			if (str2Map.containsKey(c)) {
				str2Map.put(c, str2Map.get(c) + 1);

			} else
				str2Map.put(c, 1);
		}

		if (str1Map.entrySet().equals(str2Map.entrySet())) {
			System.out.println("The strings are anagrams.");
		} else
			System.out.println("The strings are not anagrams.");

	}

}
