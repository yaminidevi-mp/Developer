package basicprogram;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number%10;
		temp=(int) Math.pow(temp,3);
		
	}

}
