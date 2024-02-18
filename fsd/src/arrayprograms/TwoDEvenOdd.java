package arrayprograms;
import java.util.Scanner;
public class TwoDEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
//		int[] arr={11,8,21,12,4,5,7,23,12};
		System.out.println("Original array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		int evenindex=0;
		int oddindex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[evenindex]=arr[i];
	            evenindex++;
			}
			else {
				odd[oddindex]=arr[i];
				oddindex++; 
			}
		}
		System.out.println("\neven number : ");
		for(int i=0;i<evenindex;i++) {
			System.out.print(even[i]+" ");
		}
		System.out.println("\nOdd number : ");
		for(int i=0;i<oddindex;i++) {
			System.out.print(odd[i]+" ");
		}
	}
}
