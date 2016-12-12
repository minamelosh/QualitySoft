/**
 * Test One object of class Person stores the information for one contact in: 
 * name, address, email, phone number and notes. @author MM
 */
import java.io.Serializable;
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phoneNumber;
	private String notes;
	/**
	 * Default constructor sets the values of the member variables
	 * to the values entered in as parameters.
	 * @author EK
	 */
	public Person(String lastName, String firstName, String address, String email, String phoneNumber, String notes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.notes = notes;
	}
	/**
	 * Returns the value of lastName.
	 * @author EK
	 */
	public String getLastName() {
	    return this.lastName;
	}
	/**
	 * Returns String of one contacts information.
	 * @author EK
	 */
	@Override
	public String toString() {
		String oneContact = lastName + ", " + firstName + "\n" + address + "\n" + phoneNumber + "\n" + email + "\n" + notes + "\n";
		return oneContact;
	}
	/**
	 * Alphabetically compares object Persons based on 
	 * last name, deciding if one last name comes before, 
	 * after, or is exactly equal.
	 * @author EK
	 */
	@Override
	public int compareTo(Person personComp) {
		 return this.lastName.compareTo(personComp.getLastName());
	}
}
