
import java.util.Arrays;
/**
* Find the kth largest element in an unsorted array.
* For example, given [3,2,1,5,6,4] and k = 2, return 5.
*/
public class KthLargest {

    private int[] helper;
	private int[] array;

	public static void main(String[] args) {
		int[] t =  {3,2,1,5,6,4}; //{45,23,11,89,77,98,4,28,65,43};
		int k = 2;

		KthLargest kk = new KthLargest();
		// The following line uses Java API to find the kth largest element.
		//kk.findKth(array, k);

		kk.helper = new int[t.length];
		kk.array = t;

		// The following uses the other way of finding the kth largest element.
		kk.findKthClassicalWay(kk.array, k);
	}

  // This is finding the kth element using Java built-in APIs.
	private void findKth(int[] array, int k) {
		Arrays.sort(array);
		System.out.println(array[array.length - k]);
	}

	private void findKthClassicalWay(int[] array, int k){
		// Sort the array. Use Merge Sort O(n logn) O(n) complexities for time and space.
		mergeSort(0, array.length-1);
		System.out.println(Arrays.toString(array));	
		System.out.println(array[k-1]);
	}

	private void mergeSort(int low, int high){
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
		  // Get the index of the element which is in the middle
		  int middle = low + (high - low) / 2;
		  // Sort the left side of the array
		  mergeSort(low, middle);
		  // Sort the right side of the array
		  mergeSort(middle + 1, high);
		  // Combine them both
		  merge(low, middle, high);
		}        
    }

	private void merge(int low, int middle, int high){

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
		  if (helper[i] <= helper[j]) {
			  array[k] = helper[i];
			  i++;
		  } else {
			  array[k] = helper[j];
			  j++;
		  }
		  k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
		  array[k] = helper[i];
		  k++;
		  i++;
		}

    }

}
