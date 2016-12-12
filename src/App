/**
 * Tests class ContactList and class Person by allowing the user to create contacts,
 * print the current ContactList, search a contact by last name, and exit/save
 * the Contact List. 
 * @author EK
 */
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		ContactList app = new ContactList();
		app.load();
		Scanner console = new Scanner(System.in);
		System.out.println("What would you like to do? (type a number and hit Enter)"+ "\n");
		while (true) {
			System.out.println("Current number of contacts in your Contact List: " + app.numberOfContacts());
			System.out.println("1 - Create a New Contact");
			System.out.println("2 - Search for existing contact by Last name");
			System.out.println("3 - Print out the whole Contact List");
			System.out.println("4 - Save Contact List and Exit the program");
			String input = console.next();
			try {
				int userChoice = Integer.parseInt(input);
				switch (userChoice) {
				case 1:
					app.createContact();
					break;
				case 2:
					app.getContact();
					break;
				case 3:
					app.printContactList();
					break;
				case 4:
					app.save();
				default:
					System.out.println("\n" + "***INPUT ERROR***-Please use only option numbers (1-4) as your input-***INPUT ERROR***"+ "\n");
				}
			} catch (NumberFormatException e) {
					System.out.println("\n" + "***INPUT ERROR***-Please use only option numbers (1-4) as your input-***INPUT ERROR***"+ "\n");
			}
		}
	}
}
