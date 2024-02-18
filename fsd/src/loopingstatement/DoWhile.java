package loopingstatement;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,21,19,16,19,29,36,34};
		//direct print the array and increment after
		int i=0;
		do {
			System.out.print(arr[i] + " ");
			i++;
		}
		while(i<arr.length);
//if i increment first before print the output will be index out of bounce
//		int i=-1;
//		do {
//		    i++;
//			System.out.print(arr[i] + " ");
//			
//		}
//		while(i<arr.length-1);
//		
	}
}
