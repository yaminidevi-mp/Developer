package recursiveprograms;
public class RecurAscOddEven {
	private static int temp;
	public static void main(String[] args) {
		int arr[]= {11,8,23,21,12,4,5,7,23,12};
		System.out.println("Original :");
		recursive(arr,0);
		System.out.println("\nDuplicate :");
		duplicate(arr,0,0);
		System.out.println("\nOdd :");
		int oddnum[]=odd(arr,0);
		odd(arr,0);
		}
	public static int recursive(int[] arr,int i) {
		if(i<arr.length) {
			System.out.print(arr[i]+" ");
			recursive(arr,++i);
		}
		return i;
	}

	public static void duplicate(int arr[],int i,int j){
//		System.out.println("Function call i:"+i+" j:"+j);
			if(j<arr.length-1) {
				j=j+1;
			}
			else {
				i=i+1;
				j=i+1;
			}
//			System.out.println("Function call i:"+i+" j:"+j);
			if(i<arr.length) {
				if(j!=arr.length&&arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
				duplicate(arr,i,j);
			}
//			System.out.println("Function call i:"+i+" j:"+j);
		}
	public static int []odd(int arr[],int i) {
		int temp=0;
		if(i<arr.length) {
			if(arr[i]%2==0) {
				  temp = arr[i];
			      i++;
				  odd(arr,i);
			}
		}
		return arr;
	}
}
	
//	 int oddArr[]= odd(arr,0);
//	   System.out.println("\nodd :");
//	   print(oddArr);
//	 int dup[]=duplicate(arr,0,0);
//	   System.out.println("\nduplicate :");
//	   print(dup);
//	public static int even(int arr[],int i) {
//		if(i<arr.length) {
//				if(arr[i]%2==0) {
//					++i;
//				}
//				even(arr,i);
//			}
//			return i;
//		}		
//	


