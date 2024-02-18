package oops.abstraction;

public abstract class GrandMother {
	String name;
// 	constructor
	public GrandMother(String name) {
		this.name = name;
	}
//	Normal function/method
	public void  setName(String name) {
		this.name = name;
	}
//	Normal function/method
	String getName() {
		return name;
	}
// 	abstract function/method
	abstract void getAge(String dob);

}
