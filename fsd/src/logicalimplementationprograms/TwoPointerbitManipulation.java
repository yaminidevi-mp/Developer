package logicalimplementationprograms;
import java.util.*;
public class TwoPointerbitManipulation {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		int arr[] = {7, 21, 8, 9, 16, 23};
		System.out.println("27 :"+bitSum(arr,27));
		System.out.println("14 :"+bitSum(arr,14));
		System.out.println("16 :"+bitSum(arr,16));
		System.out.println("42 :"+bitSum(arr,42));
		System.out.println("39 :"+bitSum(arr,39));
		System.out.println("18 :"+bitSum(arr,18));
		
	}
	public static boolean bitSum(int arr[],int sum) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
}
