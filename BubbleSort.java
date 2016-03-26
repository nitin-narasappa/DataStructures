import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        new BubbleSort().sort(input);
	}
	
	// Do bubble sort
	private void sort(int[] array) {
		int length = array.length;
        int counter;
        for (int m = length; m >= 0; m--) {
            for (int i = 0; i < length - 1; i++) {
                counter = i + 1;
                if (array[i] > array[counter]) {
					int temp = array[i];
					array[i] = array[counter];
					array[counter] = temp;
                }
            }
        }
		System.out.println(Arrays.toString(array));
	}
}
