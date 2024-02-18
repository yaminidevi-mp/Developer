package oops.encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		Person person = new Person("Yamini", "Devi");
		
		person.setAge("22");
		person.setGender("Female");
		person.setBloodGroup("O+ve");
		
		System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+"/"+person.getGender());
		
	}

}
