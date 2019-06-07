package java_exercise;

/**
 * 
 * Java main skeleton 
 */
public class MyFirstExercise /* class definition **/ {

	public static void main(String[] args) {
		
		/***
		 * 
		 * There are 2 main of java exceptions
		 * 1. Checked exception --- exceptions that are detected during compile time because the compile checks during build
		 * 2. Unchecked exception  --- are runtime exception that are detection during execution
		 */
		
		/**
		 * Handle exceptions using try/catch 
		 */
		
		//Initial with null -
		try {
			Person person = null;//new Person();	
			String msg = "person :"+person.firstName; //null pointer exception
			System.out.println(msg);
		}
		catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println("Error: "+ex.getMessage());
		}
		
		
		//Initialize with Person
		Person person2 = new Person();	
		person2.firstName = "Ebrima";
		person2.setLastName("Tunks");

		person2.setSsn(10100101);
		String msg = "person2  name :"+person2.firstName +" last name: "+ person2.getLastName() +" , ssn: "+person2.getSsn(); //null pointer exception
		System.out.println(msg);
	
		System.out.println(person2);
	}

}
