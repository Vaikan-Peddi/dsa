// Java code to implement Insertion sort

public class InsertionSort {
	public static void main(String[] args) {
		int[] unsorted = {6, 2, 4, 9, 10, 8, 5};
		//Algorithm starts below:

		for (int i = 1; i<unsorted.length; i++) {
			int key = unsorted[i];
			int j = i-1;
			while (j>=0 && unsorted[j] > key) {
				unsorted[j+1] = unsorted[j];
				j--;
			}
			unsorted[j+1] = key;
		}

		for (int i : unsorted) {
			System.out.println(i);
		}

	}
}
