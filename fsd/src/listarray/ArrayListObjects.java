package listarray;

import java.util.ArrayList;

public class ArrayListObjects {
	public static void main(String[] args) {
	ArrayList<Person> alPerson = new ArrayList<Person>();
	
	Person p1 = new Person("Yamini", "Female", 22);
	Person p2 = new Person("dev", "male", 23);
	Person p3 = new Person("reshi", "Female", 19);
	Person p4 = new Person();
	p4.setName("Yamini");
	p4.setGender("Female");
	p4.setAge(22);
	
	
	
	alPerson.add(p1);
	alPerson.add(p2);
	alPerson.add(p3);
	alPerson.add(new Person("Yamini", "Female", 22));//direct object pushing
	
	for(int i=0; i<alPerson.size(); i++) {
		Person person = alPerson.get(i);
		System.out.println("*******for*********");
		System.out.println("name: "+person.getName());
		System.out.println("gender: "+person.getGender());
		System.out.println("age: "+person.getAge());
	}
//  for(Person person : alPerson){ }
//	or
//  for(int i=0 ;i<alPerson.size();i++){
//	Person person = alPerson.get(i);}
//  or
//  alPerson.forEach(person -> { }
	//for each loop :
	alPerson.forEach(Person-> {
		System.out.println("********foreach********");
		System.out.println("name: "+Person.getName());
		System.out.println("gender: "+Person.getGender());
		System.out.println("age: "+Person.getAge());
	}); 
	
	
	}
}
