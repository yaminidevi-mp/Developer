package loopingstatement;

import java.util.*;

class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,9,21,19,16,19,29,36,34};
		int i=2;
		while(i<arr.length)
		{   
			
			System.out.println(arr[i]+ " : " +i);
			i+=2;
		}
//		Scanner sc=new Scanner(System.in);
//	    int num=sc.nextInt();
//	    int reverse = 0;
//	    while (num != 0) {
//	        reverse = reverse * 10 + num % 10;
//	        num /= 10;
//	    }
//	    System.out.println(reverse);
	}

}
