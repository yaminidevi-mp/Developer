package oopsprograms;

import oops.inheritance.single.Son;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		SingleInheritanceSon obj=new SingleInheritanceSon();
		SingleInheritanceFather obj1=new SingleInheritanceFather();
		System.out.println(obj1.getGender());
		obj1.print();
	}

}
