package addressBook;

public class Addresses extends AddressBook {
	
	//Constructor that receives user input
	void SetAddressBookDetails(String setName, String setNumber, String setAddress, int slot) 
	{
		getNames().set(slot, setName);
		getAddresses().set(slot, setAddress);
		getNumbers().set(slot, setNumber);
	}


	//Method for showing address book details given a specified slot
	void showAddressBookDetails(int slot) 
	{
		System.out.println("\n**************************");
		System.out.println("Entry for slot "+slot+":");
		System.out.println("Name: "+getNames().get(slot));
		System.out.println("Address: "+getAddresses().get(slot));
		System.out.println("Phone Number: "+getNumbers().get(slot));
		System.out.println("**************************");
	}
	
	//Method to delete all entries
	void deleteEntires() 
	{
		//Uses a for loop to check all slots in the arrays
		for(int i = 0; i<11; i++) 
		{
			getNames().set(i, "Empty");
			getAddresses().set(i, "Empty");
			getNumbers().set(i, "Empty");
		}
	}
	
	//Method for changing the address in the address array
	void changeAddress(String setAddress, int slot) 
	{
		getAddresses().set(slot, setAddress);
	}
}
