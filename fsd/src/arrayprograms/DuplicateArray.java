package arrayprograms;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,8,23,21,12,4,5,7,23,12};
		System.out.println("original array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int duplicate=0;
		System.out.println("\narray duplicates : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate++;
					System.out.print(arr[j]+" ");
				}
			}
		}
		System.out.println("\ncount: "+duplicate);
	}
}
