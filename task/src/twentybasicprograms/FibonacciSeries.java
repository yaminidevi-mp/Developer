package twentybasicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing the constants
		int n = 10, t1 = 0, t2 = 1;
		System.out.print("Upto " + n + ": ");
		//while loop to calculate fibonacci series upto n numbers
		while (t1<= n)
		{
		System.out.print(t1 + " , ");
		int sum = t1 + t2;
		t1 = t2;
		t2 = sum;
		}
	}

}
