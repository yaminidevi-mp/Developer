package basicprogram;
import java .util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);	
	int num=sc.nextInt();
	boolean prime=true;
	int i=2;
	while(i<num/2) {
		if(num%i==0) {
			 prime=false;
			 break;
		 } 
		i++;
	}
	if(prime==true) {
		System.out.println("prime");
	}else {
		System.out.println("Not a prime");
	}
	
	
	
//	 for(int i=2;i<num;i++) {
//		 if(num%i==0) {
//			 prime=false;
//			 break;
//		 } 
//	 }
//	 System.out.println(prime);
	 
	}

}
