
public class NewClass {

	public static void main(String[] args) {

		int[] array = { 35, 12, 10, 1, 5, 3, 48, 7, 6, 0, 8 };

		int min = array[0];
		int max = 0;

		for (int i = 1; i < array.length; i++) {

			if ((array[i] > min) && (array[i] > max)) {
				max = array[i];
			} else if (array[i] < min) {
				max = min;
				min = array[i];
			}
		}

		System.out.println("The largest element in array is: " + max);
		System.out.println("The smallest element in array is: " + min);
	}

}
//min=35 max =0
//max = 35 min =12
//max = 12 min = 10
//max = 10 min=1
//max=48 min = 1