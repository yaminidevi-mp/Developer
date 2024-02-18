package arrayprograms;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[][] {
		{2,3,5},{9,6,2},{2,9,4},{7,9,2},{8,2,6}};
		System.out.println("*******2D Array*******");
		twoArray(arr);
		System.out.println("*******rowReverse*******");
		rowReverse(arr);
		System.out.println("*******colReverse*******");
		colReverse(arr);
		System.out.println("*******rowcolReverse*******");
		rowColReverse(arr);
		
}
		public static void twoArray(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				int[] val=arr[i];
				for(int j=0;j<val.length;j++)
				{
					System.out.print(val[j]+" ");
				}
				System.out.println();
			}
		}
		public static void rowReverse(int[][] arr) {
			for(int i=arr.length-1;i>=0;i--) {
				int[] val=arr[i];
				for(int j=0;j<val.length;j++){
					System.out.print(val[j]+" ");
				}
				System.out.println();
			}
		}
		public static void colReverse(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				int[] val=arr[i];
				for(int j=val.length-1;j>=0;j--)
				{
					System.out.print(val[j]+" ");
				}
				System.out.println();
			}
		}

		public static void rowColReverse(int[][] arr) {
			for(int i=arr.length-1;i>=0;i--) {
				int[] val=arr[i];
				for(int j=val.length-1;j>=0;j--)
				{
					System.out.print(val[j]+" ");
				}
				System.out.println();
			}
		}
	}


