package oops.inhertance.multilevel;

public class MulilevelinheritanceMain {
	public static void main(String[] args) {
		Grandfather grandfather=new Grandfather(17/2/2002);
		Father father=new Father("Prasanna");
		Son son=new Son("Rahul");
		System.out.println(grandfather.getDob());
		System.out.println(father.getDob());
		System.out.println(son.getDob());
		
	}
}
