package selection_sort;

import java.util.Arrays;

public class SelectionSort {
	// Selection sort in Java
	  void selectionSort(int array[]) {
	    int size = array.length;

	    for (int step = 0; step < size - 1; step++) {
	      int min_idx = step;

	      for (int i = step + 1; i < size; i++) {

	        // To sort in descending order, change > to < in this line.
	        // Select the minimum element in each loop.
	        if (array[i] < array[min_idx]) {
	          min_idx = i;
	        }
	      }

	      // put min at the correct position
	      int temp = array[step];
	      array[step] = array[min_idx];
	      array[min_idx] = temp;
	    }
	  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 20, 12, 10, 15, 2 };
	    SelectionSort ss = new SelectionSort();
	    ss.selectionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	}

}