package functionsprograms;

import java.util.Scanner;

public class FuncOperators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String operator=sc.next();
		int total=0;
		Operators oper=new Operators();
		   	 
		   	 switch(operator) {
		   	 case "+":
		   		 total=oper.add(a,b);
		   		 break;
		   	 case "-":
		   		 total=oper.sub(a,b);
		   		 break; 
		   	 case "*":
		   		 total=oper.mul(a,b);
		   		 break;
		   	 case "/":
		   		 total=oper.div(a,b);
		   		 break;
		   	 case "%":
		   		 total=oper.mod(a,b);
		   		 break;
		   	 
}
		   	 System.out.println("Total : "+total);
	}
}
	
   	 

