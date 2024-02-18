package oops.polymorphism;

public class Arith extends SimpleMath {
int a=0,b=0;
String name;
//constructor overloading(Different arguments,same method name and same class name)
	public Arith(int a, int b) {
		super(a,b);//new SimpleMath(a,b)
		this.a=a;
		this.b=b;
	}
//	public Arith(String name) {
//		this.name=name;
//	}
	//Method OverLoading(Different arguments and same method name)
	public int add(int a,int b) {
		return a+b;
	}
	@Override
	public int add() {
//		return this.a+this.b;
		super.add();//using superkeyword 
		return a+b+b;//manual calculation 
	}

}
