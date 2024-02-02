package task;

import java.util.Scanner;

public class SwitchProgram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch(a%2) {
	case 1:
		 System.out.println("odd num");
		 break;
	case 0:
		 System.out.println("even num");
		 break;
}
}
}
