/**
 * One object of class Person stores the information 
 * for one contact in class contactList: name, address, 
 * email, phone number and notes.
 * @ author MM
 */
public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	private String notes;
	
	/**
	 * Returns true if personComp equals this person.
	 */
	public boolean equals(Object personComp){
		//return true if personComp equals this person
		
		return false;
	}
	
	/**
	 * Returns String of one contacts information.
	 */
	public String toString(){
		//return object stringified
		return "";
	}
	
	/**
	 * Returns a value representing this object comes before
	 * or after the object it is being compared to.
	 */
	public int compareTo(Person personComp) {
		return personComp.compareTo(this);
	}
}
