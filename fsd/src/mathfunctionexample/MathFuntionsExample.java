package mathfunctionexample;

import java.util.Random;

public class MathFuntionsExample {

	public static void main(String[] args) {
		Integer a = 16;
		Integer b = 12;
		Double c = 12.7;
		Double d = 11.2;
		Integer t1 = -217;
		Integer t2 = 317;
		Double t3 = 37.5, t4 = 22.3, t5 = 31.6;
		Integer t6 = 99;
		
		System.out.println("Absolute : "+Math.abs(c));
		System.out.println("Absolute : "+Math.abs(a));
		System.out.println("Ceil : "+Math.ceil(c));
		System.out.println("Floor : "+Math.floor(c));
		System.out.println("Round : "+Math.round(c));
		System.out.println("Round : "+Math.round(d));
		System.out.println("Square : "+Math.sqrt(a));
		System.out.println("Max : "+Math.max(c, a));
		System.out.println("Min : "+Math.min(a, d));
		System.out.println("Random : "+Math.random());
		System.out.println("Power of : "+Math.pow(21, 3));
		System.out.println("Exponent value  : "+Math.exp(d));
		
		System.out.println("\nAbsolute t1 : "+Math.abs(t1));
		System.out.println("Absolute t2 : "+Math.negateExact(t2));
		System.out.println("Sum:"+ Math.round(Math.floor(t3 + t4 + (Math.floor(t5) + t6))));
		
		//Random Numbers :
		Random r = new Random();
		System.out.println("\nRandom number : "+r.nextDouble(1.45, 999.99));
		
		//String static method :
		String.join("Hello", "World");
		
		//Prime number function call : 
		System.out.println("Primenumber : "+isPrime(64));
		//Finding GreatestCommonFactor Value number function call : 
		System.out.println("GreatestCommonFactor : "+findGcf(80, 75));
	}
	
	
	public static boolean isPrime(Integer num) {
		
		if(num <= 1) {
			return false;
		}
		
		for (int j=2; j<=Math.sqrt(num); j++){
		    if(num%j==0){
		            return false;
		        }
			}
		return true;
	}
	
	public static int findGcf(int x,int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	

}

