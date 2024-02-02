package intro;

public class ClassExample {
	private String name;
	private String gender;
	private int age;
	private float weight;
	//custom 
	public ClassExample(String name, String gender, int age, float weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}//default
	public ClassExample() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "ClassExample [name=" + name + ", gender=" + gender + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
// public String getname() {
//	 return "yamini";
//	 
// }
// public int age() {
//	 return 99;
// }
// public float weight() {
//	 return 89.9f;
// }
}
