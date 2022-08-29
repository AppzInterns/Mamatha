import java.util.HashSet;
import java.util.Set;

public class CommonElementInArrays {

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 2, 1 };
		Integer[] arr2 = { 1, 2, 3 };

		Set<Integer> arSet1, arSet2;

		arSet1 = new HashSet<Integer>();
		arSet2 = new HashSet<Integer>();

		for (int i : arr1) {
			arSet1.add(i);
		}

		for (int i : arr2) {
			arSet2.add(i);
		}

		System.out.println(arSet1);
		System.out.println(arSet2);

		if (arSet1.containsAll(arSet2))
			System.out.println("The list has common elements");
		else
			System.out.println("The list has no common elements");

	}

}
