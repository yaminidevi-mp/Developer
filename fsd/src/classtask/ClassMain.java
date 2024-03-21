package classtask;

public class ClassMain  {

	public static void main(String[] args) {
		//Constructor creation
		//ClassName objectName = new Constructor
		Sum sum = new Sum(3, 6);
	
		//function call :
		int ans = sum.add(2, 4); // Normal method(objectName.methodName);
		float ans1 = Sum.addFloat(6.5f, 7.2f);// Static method(ClassName.staticMethod
		System.out.println("Add Number : "+ans);
		System.out.println("Add Number2 : "+ans1);
		
		Sum1<Integer, Double> sum1 =new Sum1<Integer, Double>(2,3);
		System.out.println("Add Number Integer : "+sum1.add());
		System.out.println("Add Number Double : "+sum1.add(2.3, 3.4));
	}

}
