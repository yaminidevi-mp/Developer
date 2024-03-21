package integerexp;

public class IntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer default methods : 
		Integer age = new Integer(46);
		Integer age1 = 99;
		String pincode = "621211";
		Integer pin = Integer.parseInt(pincode);
		String ageStr = age1.toString();
		System.out.println("max : " + age1.max(21, 17));
		System.out.println("min : " + age1.min(21, 17));
		System.out.println("sum : " + Integer.sum(21, 17));
		
		//Double default methods : 
		Double d = new Double(21.6);
		Double d1 = 32.9;
		System.out.println(Double.parseDouble(ageStr));
		System.out.println(Double.sum(21.3, 12.5));
		String dStr = d.toString();
		System.out.println(dStr);
		
		//converting the int to string other method:
		int ageint = 30;
		String agestr = "" + ageint;
	}

}
