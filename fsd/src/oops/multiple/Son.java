package oops.multiple;

public class Son extends Father implements Mother {
	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	int age=99;
	public void name(String name) {
		System.out.println(name);
	}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}	

}
