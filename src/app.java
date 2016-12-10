/*
 * Tests class ContactList and class Person by allowing the user to create two contacts 
 * and printing the current ContactList after each successful creation
 */
import java.util.Scanner;


public class app {

	public static void main(String[] args) {
		ContactList app = new ContactList();
		Scanner console = new Scanner(System.in);
		System.out.println("What would you like to do? (type a number and hit Enter)");
		System.out.println("");
		while (true) {
			System.out.println("1 - Create a New Contact");
			System.out.println("2 - Search for existing contact by Last name");
			System.out.println("3 - Print out the whole Contact List");
			System.out.println("4 - Save Contact List and Exit the program");
			int userChoice = console.nextInt();
			
			switch (userChoice) {
			case 1: app.createContact();
					break;
			case 2: app.getContact();
					break;
			case 3: app.printContactList();
					break;
			}
			
		}
		
	}
}

