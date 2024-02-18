package searchingmethods;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {7,8,12,13,9,2,4};
		int num=9;
		int result=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == num) {
				result=i;
				System.out.println(arr[i]);
				break;
			}
			}
		if(result == -1)
		{
			System.out.println("The number is not available in the array ");
		}
		}
	}


