import java.util.Scanner;
/**
* Find an element in the sorted array.
*/
public class BinarySearch {
	
	public static void main(String[] args){
		int first, last, middle, size, search;
		int[] input;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of items");
		size = reader.nextInt();
		input = new int[size];
		for (int i =0; i< size; i++){
			input[i] = reader.nextInt();
		}
		
		System.out.println("Item to search");
		search = reader.nextInt();
		
		new BinarySearch().search(input, search);
	}
	
	private void search(int[] input, int search){
		int first =0;
		int last = input.length;
		int middle = first + last /2;
		
		while( first <= last ) {
			if ( input[middle] < search ) {
				first = middle + 1;    
			} else if ( input[middle] == search ) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else {
				 last = middle - 1;
			}
			middle = (first + last)/2;
		}
		
		if ( first > last ) {
			System.out.println(search + " is not present in the list.\n");
		}
	}
}
