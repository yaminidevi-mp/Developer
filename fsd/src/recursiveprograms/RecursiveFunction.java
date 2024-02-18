package recursiveprograms;
public class RecursiveFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,5,8,2,9};
		System.out.println("Original ");
		recursive(arr,0);
		System.out.println("\nReverse ");
		reverseRecursive(arr,arr.length-1);
		System.out.println("\nSorted ");
		int[] aseRes=asc(arr,0,0);
		System.out.print("\nAscending :");
		print(aseRes);
		int[] descRes=desc(arr,0,0);
		System.out.print("\nDescending :");
		print(descRes);
	}
	public static int recursive(int[] arr,int i) {
		if(i<arr.length) {
			System.out.print(arr[i]+" ");
			recursive(arr,++i);
		}
		return i;
	}
	public static int reverseRecursive(int[] arr,int i) {
		if(i>=0) {
			System.out.print(arr[i]+" ");
			reverseRecursive(arr,--i);
		}
		return i;
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static int[] asc(int[] arr,int i,int j) {
		if(j<arr.length-1) {
			j++;
		}
		else {
			j=0; 
			i++;
		}
		if(i<arr.length) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;	
			}
		asc(arr,i,j);
	}
		return arr;
	}
	public static int[] desc(int[] arr,int i,int j) {
		if(j<arr.length-1) {
			j++;
		}else {
			j=0;
			i++;
		}
		if(i<arr.length) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			desc(arr,i,j);
		}
		return arr;
	}
}
