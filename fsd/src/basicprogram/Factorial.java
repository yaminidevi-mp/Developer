package basicprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int factor=1;
		//for loop
		for(int i=1;i<=number;i++) {
			factor=factor*i;
		}
		System.out.println(factor);
		
		
	}

}
