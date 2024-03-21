package listarray;

public class Person {
	String name, gender;
	int age;
	
	//empty construtor :
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String gender, int age){
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

