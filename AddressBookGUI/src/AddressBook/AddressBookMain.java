package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	/**
	 * 
	 * Micheal Cini
	 * Address Book assignment using inheritance and OOP
	 * 
	 */
	
	
	public static void main(String[] args) 
	{
		//Initializes Objects
		Addresses book = new Addresses();
		Scanner input = new Scanner(System.in);
		
		//Sets all arrays to default (Calls the default constructor)
		book.setArrayEmpty();
		
		//Declare variables
		String choice = "menu", edit;
		int slot = 0;
		
		//Creates while loop for menu system
		while (choice.equalsIgnoreCase("menu")) 
		{
			//Menu
			System.out.println("Welcome to your phone book! What would you like to do?\n"
					+ "1) Create New Entry\n"
					+ "2) View All Current Entries\n"
					+ "3) Look Up/Edit An Entry Using A Name\n"
					+ "4) Search by Area Code\n"
					+ "5) Delete All Current Entries");
			choice = input.next();
			
			//Checks to see if entry was valid
			if(choice.equalsIgnoreCase("1")||choice.equalsIgnoreCase("2")||choice.equalsIgnoreCase("3")||choice.equalsIgnoreCase("4")||choice.equalsIgnoreCase("5")) 
			{
				//If use chose option 1
				while (choice.equalsIgnoreCase("1")) 
				{
					//Sets the slot that this entry will be stored in
					System.out.println("Which slot would you like to add this entry to? (0-10)");
					slot = input.nextInt();
					//Sets the name that will be associated with this entry
					System.out.println("What is the name of the person you would like to add?");
					input.nextLine();
					book.setName(input.nextLine());
					//Sets the phone number that will be associated with this entry
					System.out.println("What is the Phone Number of the person you would like to add?");
					book.setNumber(input.nextLine());
					//Sets the address that will be associated with this entry
					System.out.println("What is the address for the person you would like to add? (Ex. 2008 King Rd)");
					book.setAddress(input.nextLine());
					
					//Sets the address book details at the given slot using the user input
					book.SetAddressBookDetails(book.getName(), book.getNumber(), book.getAddress(), slot);
					
					//Displays the address book details at that slot
					book.showAddressBookDetails(slot);
					
					//Asks to return to menu or exit
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					book.setAnswer(input.nextLine());
					if (book.getAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				
				//Checks if user chose option 2
				while (choice.equalsIgnoreCase("2")) 
				{
					//Uses a for loop that will print all entries in the address book
					for(int i=0; i<11; i++) 
					{
						slot = i;
						book.showAddressBookDetails(slot);
					}
					
					//Asks if user wants to continue or exit
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					input.nextLine();
					book.setAnswer(input.nextLine());
					if (book.getAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				
				//Checks if user chose option 3
				while (choice.equalsIgnoreCase("3")) 
				{		
					//Gets a name from user to search for in address book
					System.out.println("What is the name you would like to use?");
					input.nextLine();
					book.setUseName(input.nextLine());
					slot = book.nameLookup(book.getUseName(), slot);
					//Checks if an entry with that name exists
					if (slot == 12) 
					{
						System.out.println("Entry Not Found!");
					}
					else 
					{
						book.showAddressBookDetails(slot);
						System.out.println("Would you like to edit this entry?");
						
						//Allows user to edit the entry
						if(input.next().equalsIgnoreCase("yes")) 
						{
							System.out.println("What would you like to edit?\n"
									+ "1) Name\n"
									+ "2) Address\n"
									+ "3) Phone Number");
							edit = input.next();
							if(edit.equals("1")||edit.equals("2")||edit.equals("3")) 
							{
								while (edit.equals("1")) 
								{
									//Sets a new name using user input if user chooses option 1
									System.out.println("What Would You Like The New Name to Be?");
									input.nextLine();
									book.setName(input.nextLine());
									book.changeName(book.getName(), slot);
									System.out.println("Edited Entry:");
									book.showAddressBookDetails(slot);
									edit = "null";
								}
								
								while (edit.equals("2")) 
								{
									//Sets a new address using user input if user chooses option 2
									System.out.println("What Would You Like The New Address to Be?");
									input.nextLine();
									book.setAddress(input.nextLine());
									book.changeAddress(book.getAddress(), slot);
									System.out.println("Edited Entry:");
									book.showAddressBookDetails(slot);
									edit = "null";
								}
								
								while (edit.equals("3")) 
								{
									//Sets a new phone number using user input if user chooses option 3
									System.out.println("What Would You Like The New Phone Number to Be?");
									input.nextLine();
									book.setNumber(input.nextLine());
									book.changeNumber(book.getNumber(), slot);
									System.out.println("Edited Entry:");
									book.showAddressBookDetails(slot);
									edit = "null";
								}
							}
						}
					}
					
					//Checks if user wants to continue or exit
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					input.nextLine();
					book.setAnswer(input.nextLine());
					if (book.getAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				
				//Checks if user chooses option 4
				while (choice.equalsIgnoreCase("4")) 
				{
					//Asks for the area code that will be searched for
					System.out.println("What area code would you like to search for?");
					book.setUseArea(input.next());
					int count = 0;
						//Creates a for loop that checks every slot in the phone number array
						for (slot=0; slot<book.getNumbers().size(); slot++) 
						{
							//Checks if the characters between index 0 and 3 are equal to what the user wanted to look for (Uses substring)
							if (book.getNumbers().get(slot).substring(0,3).equals(book.getUseArea())) 
							{
								//Shows the address book details if that area code is found
								book.showAddressBookDetails(slot);
								count++;
							}
							//if no entries are found
							else if (slot == 10 && count == 0)
							{
								System.out.println("No Entries Found!");
							}
							
						}
						//Checks if user wants to continue or exit
						System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
						input.nextLine();
						book.setAnswer(input.nextLine());
						if (book.getAnswer().equalsIgnoreCase("yes")) 
						{
							choice = "menu";
						}
						else 
						{
							System.out.println("See you around!");
							choice = "null";
						}
				}
				
				//Checks if user chooses option 5
				while (choice.equalsIgnoreCase("5")) 
				{
					//Asks user to confirm their option
					System.out.println("Are you sure you want to delete all entries? Please enter \"Yes\" or \"No\"");
					//Checks yes or no
					if(input.next().equalsIgnoreCase("yes")) 
					{
						book.deleteEntires();
						System.out.println("All Entries Deleted");
					}
					
					//Checks if user wants to continue or exit
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					input.nextLine();
					book.setAnswer(input.nextLine());
					if (book.getAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
					
				}
			}
			else 
			{
				System.out.println("Invalid Entry! Please Try Again");
				choice = "menu";
			}
		}
		input.close(); //Closes the scanner variable
	}
}
