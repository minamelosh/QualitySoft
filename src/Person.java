/**test
 * One object of class Person stores the information 
 * for one contact in class contactList: name, address, 
 * email, phone number and notes.
 * @ author MM
 */
import java.util.*;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	private String notes;
	
	public Person(String firstName, String lastName, String address, String email, String phoneNumber, String notes){
		
	}
	
	/*
	 * Makes private variables available for class Contact list to set the values stored in them.
	 */
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	public void setAddress(String newAddress){
		address = newAddress;
	}
	public void setEmail(String newEmail){
		email = newEmail;
	}
	public void setPhoneNumber(String newPhoneNumber){
		phoneNumber = newPhoneNumber;
	}
	public void setNotes(String newNotes){
		notes = newNotes;
	/**
	 * Allows class person to get the new values stored in private variables. 
	 */
	}
	public String getLastName(){
		return lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getAddress(){
		return address;
	}
	public String getEmail(){
		return email;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getNotes(){
		return notes;
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
		return 0;
		//return personComp.compareTo(this);
	}
}
