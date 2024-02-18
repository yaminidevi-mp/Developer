package twentybasicprograms;
import java.util.Scanner;
public class Multiply_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number:");
		n = s.nextInt();
		int mul = n << 2;
		System.out.println("Answer:"+mul);
	}

}
