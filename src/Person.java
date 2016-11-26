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
	
	public Person(String firstName, String lastName, String address, String email, String phoneNumber, String notes){
		
	}
	
	/*
	 * Returns new contacts data from class ContactList.
	 */
	public String getInfo(){
		
		return "";
	}
	
	/**
	 * Returns true if entered lastname equals this lastname.
	 */
	public boolean equals(String lastname){
		
		return false;
	}
	
	/**
	 * Returns String of one contacts information.
	 */
	public String toString(){
		
		return "";
	}
	
	/**
	 * Returns a value representing if this object comes before
	 * or after the object it is being compared to.
	 */
	public int compareTo(Person personComp){
		
		return personComp.compareTo(this);
	}
}
