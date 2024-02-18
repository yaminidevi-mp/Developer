package arrayprograms;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {7,8,4,3,1,9,6};
		System.out.print("original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int temp=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]>arr[i]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;  
					}
				}
			
		}
			System.out.print("\nSorted array : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(""+arr[i]+" ");
			}

		
	}
	
}

