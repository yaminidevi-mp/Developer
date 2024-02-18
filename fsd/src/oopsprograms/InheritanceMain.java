package oopsprograms;

public class InheritanceMain {
public static void main(String[] args) {
	InheritanceAnimal obj=new InheritanceAnimal();
	InheritanceDog obj1=new InheritanceDog();
	System.out.println(obj.noLegs);
	System.out.println(obj1.canBark);
	obj.eat();
	obj.walk();
}
}
