package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {21,8,6,19,2,9};
		mergeSort(arr, 0, arr.length-1);
	}
	public static int[] mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int middle = (right+left)/2;
//			int middle = 10 + ((20-10)/2) = 15
			// method call
			int rightFinal[] = mergeSort(arr, middle+1, right);
			int leftFinal[] = mergeSort(arr, left, middle);
			// method return
			sort(arr, left, right, middle);
		}
		return arr;
	}
	
	public static void sort(int[] arr, int left, int right) {
		
	}
	
}


