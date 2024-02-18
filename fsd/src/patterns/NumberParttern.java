package patterns;
import java.util.Scanner;
public class NumberParttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
//				if(i==j) {
//					count++;
//					System.out.print(""+count);
//				}
//				else {
					System.out.print(""+j);

//				}
				
			}
			System.out.println(" ");

		}
}

}
