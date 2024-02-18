package oops.encapsulation;

public class Person {
	String firstName, lastName, salutation, gender, ssn, address, zipCode, phoneNumber, dob, bloodGroup,age;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	 public String getFirstName() {
		return firstName;
	}
	 public String getLastName() {
		return lastName;
	}
	 public String getSalutation() {
		return salutation;
	}
	 public String getGender() {
		return gender;
	}
	 public String getSsn() {
		return ssn;
	}
	 public String getAddress() {
		return address;
	}
	 public String getZipCode() {
		return zipCode;
	}
	 public String getPhoneNumber() {
		return phoneNumber;
	}
	 public String getDob() {
		return dob;
	}
	 public String getBloodGroup() {
		return bloodGroup;
	}
	 public String getAge() {
		return age;
	}
	 public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
