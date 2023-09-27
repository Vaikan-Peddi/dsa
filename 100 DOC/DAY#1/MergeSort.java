// Java code to implement Merge Sort

public class MergeSort {
	public static void main(String[] args) {
		int[] unsorted = {2, 9, 7, 1, 4, 8};
		mergeSort(unsorted, 0, 5);
		for (int i : unsorted) {
			System.out.println(i);
		}
	}

	public static void merge(int[] arr, int p, int q, int r) {
		int lengthLeft = q-p+1;
		int lengthRight = r-q;

		int[] left = new int[lengthLeft];
		int[] right = new int[lengthRight];

		for (int i=0; i<lengthLeft; i++) {
			left[i] = arr[p+i];
		}

		for (int j=0; j<lengthRight; j++) {
			right[j] = arr[q+1+j];
		}

		int i=0; 
		int j=0;
		int k=p;

		while (i<lengthLeft && j<lengthRight) {
			if (left[i]<=right[j]) {
				arr[k++] = left[i++];
			}
			else {
				arr[k++] = right[j++];
			}
		}

		while (i<lengthLeft) {
			arr[k++] = left[i++];
		}

		while (j<lengthRight) {
			arr[k++] = right[j++];
		}

	}

	public static void mergeSort(int[] arr, int p, int r) {
		if (p>=r) {
			return;
			
		}

		else {
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);

			merge(arr, p, q, r);
		}
	}

}