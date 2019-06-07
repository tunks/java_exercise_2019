package java_exercise;

/***
 * A class to store information about a person 
*/
public class Person {
    String firstName; //variable  and datatype is String, by default it is public
    private String lastName;
    int age;
    private int ssn;
    
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ssn=" + ssn + "]";
	}
    
}
