import java.util.Scanner;

//Print the reverse of the words in a sentence
public class ReverseWordsInSentence {

	public static void main(String[] args) {

		String sentence;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence to be reversed: ");
		sentence = scan.nextLine();
		scan.close();

		reverseSentence(sentence);

	}

	public static void reverseSentence(String input) {

		String[] words;
		char[] charArray;

		words = new String[20];
		charArray = input.toCharArray();

		int beg = 0, j = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (i == (charArray.length - 1)) {
				words[j] = input.substring(beg);
			} else if (((charArray[i] == ' ') && (charArray[i + 1] != ' '))) {
				words[j] = input.substring(beg, i);
				j++;
				beg = i + 1;
			}
		}

		System.out.print("The reverse sentence is: ");
		for (int i = j; i >= 0; i--) {
			System.out.print(words[i] + ' ');
		}

	}

}
