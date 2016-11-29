/**
 * Tests class contactList and class person by creating new persons
 * and a new contact list. TestContactList creates new contacts, 
 * searches for a contact, compares people, tests if contacts are
 * equal, prints the contact list, and saves to disk.
 * 
 *@author MM
 */
public class TestContactList {
	public static void main(String args[]){		
		/**
		 * Tests Class Person by creating new persons and comparing them to see
		 * which one comes first alphabetically and testing if they are equal.
		 */
		Person person1 = new Person("Michael","Skittles","211 Christmas Lane","michaelskittles@gmail.com","211-1111","None");
		Person person2 = new Person("Nathan", "Chocolate", "311 Thanksgiving Drive", "nathanchocolate@yahoo.com", "311-1111", "Please call");
		System.out.println(person1.compareTo(person2));
		System.out.println(person1.equals(person2));
		Person person3 = new Person ("Sally", "Skittles", "411 Easter Street", "sallyskittles@yhoo.com", "411-1111", "Please emails");
		System.out.println(person3.compareTo(person1));
		System.out.println(person3.compareTo(person2));
		System.out.println(person3.equals(person1));
		System.out.println(person3.equals(person2));
		/**
		 * Test Class Contact List by creating new contacts, searching for a contact,
		 * creating contacts with missing information, prints the contact list, and
		 * saves to disk.
		 */
		ContactList qualitySoft = new ContactList(); 
		Person test1, test2, test3, test4;
		qualitySoft.createContact();
		qualitySoft.printContactList();
		test1 = qualitySoft.getContact("Broccoli");
		qualitySoft.save();
		qualitySoft.load();
		qualitySoft.createContact();
		qualitySoft.printContactList();
		test2 = qualitySoft.getContact("Lettuce");		
		qualitySoft.save();
		qualitySoft.load();
		qualitySoft.createContact();
		qualitySoft.printContactList();
		test3 = qualitySoft.getContact("Lettuce");
		qualitySoft.save();
		qualitySoft.load();
		qualitySoft.createContact();
		qualitySoft.printContactList();
		test4 = qualitySoft.getContact("Broccoli");
		qualitySoft.save();
		qualitySoft.load();
		System.out.println("It Works!");
	}
}
