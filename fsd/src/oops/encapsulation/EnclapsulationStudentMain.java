package oops.encapsulation;

public class EnclapsulationStudentMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setName("Yamini");
		student.setDept("ECE");
		student.setSection("A");
		student.setAge("22");
		student.setGender("Female");
		student.setBloodGroup("O +ve");
		student.setRollNo("20L161");
		
		System.out.println(student.getName()+"\n"+student.getDept()+"\n"+ student.getSection()+"\n"+student.getAge()+"\n"+student.getGender()+"\n"+student.rollNo);
	}

}
