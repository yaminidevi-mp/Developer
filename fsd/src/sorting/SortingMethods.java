package sorting;

public class SortingMethods {

	public static void main(String[] args) {
		int arr[] = {21,9,16,18,17,2};
		int[] arr1 = bubbleSort(arr.clone());
		System.out.println("BubbleSort : ");
		for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
		}
		System.out.println("\n**************");
		System.out.println("selectionSort : ");
		int[] arr2 = selectionSort(arr.clone());
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			}
		System.out.println("\n**************");
		System.out.println("InsetionSort : ");
		int[] arr3 = insetionSort(arr.clone());
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
			}
	}
	
	public static int[] bubbleSort(int arr[]) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr1[]) {
		int arr[]=arr1;
		for(int i = 0; i<arr.length-1; i++) {
			int minindex = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
					int temp = arr[i];
					arr[i] = arr[minindex];
					arr[minindex] = temp;
				}
		
		return arr;
	}
	public static int[] insetionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int currentVal = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > currentVal) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = currentVal;
		}
		return arr;
	}

}