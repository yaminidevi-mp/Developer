package basicprogram;
import java.util.Scanner;
public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		arr[0]=1;
	    arr[1]=1;
		int total=arr[0]+arr[1];
		System.out.print("arr[0] "+arr[0]+" arr[1] "+arr[1]);
//		for loop:
		 	for(int i=2;i<num;i++) {
		 		arr[i]=arr[i-1]+arr[i-2];
				total+=arr[i];
		 		System.out.print("arr["+i+"] "+arr[i]+":  ");

				
			}
		 	System.out.print(total);
//		int i=2;
//      while loop:
//		while(i<=num) {
//			num3=num1+num2;
//			System.out.print(" "+num3);
//			num1=num2;
//			num2=num3;
//			i++;
//		}
//		
//		do {
//			num3=num1+num2;
//			System.out.print(arr[num]+"arr[ ] "+num3);
//			num1=num2;
//			num2=num3;
//			i++;
//		}while(i<=num);
			  
			  
		}
	}


