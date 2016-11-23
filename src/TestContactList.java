/**
 * Tests class contactList by creating a new contact
 * list.  TestContactList creates new contacts, searches
 * for a contact, prints the contact list, saves to disk,
 * quits the file, and then reloads the file.
 * 
 *@author MM
 */
public class TestContactList {
	public static void main(String args[]){
		ContactList QualitySoft = new ContactList(); 	
		QualitySoft.createContact();
		QualitySoft.printContactList();
		QualitySoft.getContact("Broccoli");
		QualitySoft.save();
		QualitySoft.load();
		QualitySoft.createContact();
		QualitySoft.printContactList();
		QualitySoft.getContact("Lettuce");
		QualitySoft.save();
		QualitySoft.load();
		QualitySoft.createContact();
		QualitySoft.printContactList();
		QualitySoft.getContact("Lettuce");
		QualitySoft.save();
		QualitySoft.load();
		QualitySoft.createContact();
		QualitySoft.printContactList();
		QualitySoft.getContact("Broccoli");
		QualitySoft.save();
		QualitySoft.load();
		QualitySoft.load();
		System.out.println("It Works!");
	}
}
