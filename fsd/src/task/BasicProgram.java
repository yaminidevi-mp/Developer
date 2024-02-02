package task;

import java.util.Scanner;

public class BasicProgram {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	if(p%2==1) {//(!(p%2==0))
		 System.out.println("odd");
	}
	else {
		 System.out.println("even");
	}
}
}
