package addressBook;

import java.util.ArrayList;

public class AddressBook {

	//Declare Private Variables and Arrays
	private ArrayList<String> names = new ArrayList<String>(11);
	private ArrayList<String> addresses = new ArrayList<String>(11);
	private ArrayList<String> numbers = new ArrayList<String>(11);

	private String setName;
	private String answer;
	private String number;
	private String address;
	private String useName;
	private String useArea;

	
	//Default Constructor
	void setArrayEmpty() 
	{
		for (int i = 0; i < 11; i++) 
		{
			getNames().add(i, "Empty");
			getAddresses().add(i, "Empty");
			getNumbers().add(i, "Empty");
		}
	}

	//Method to lookup a user specified name in the address book
	int nameLookup(String useName, int slot) 
	{
		for (int i = 0; i < getNames().size(); i++) //For loop to check all the array slots
		{
			if (getNames().get(i).equalsIgnoreCase(useName)) 
			{
				slot = i;
				break;
			} 
			else 
			{
				slot = 12;
			}
		}
		return slot; //Returns the slot with specified value
	}

	//Method to change the name in an array with a specified slot
	void changeName(String setName, int slot) 
	{
		getNames().set(slot, setName);
	}
	
	//Method to change the address in an array with a specified slot
	void changeAddress(String setAddress, int slot) 
	{
		getAddresses().set(slot, setAddress);
	}

	//Method to change the number in an array with a specified slot
	void changeNumber(String setNumber, int slot) 
	{
		getNumbers().set(slot, setNumber);

	}

	//Getter for Name Array
	public ArrayList<String> getNames() 
	{
		return names;
	}

	//Setter for Name Array
	public void setNames(ArrayList<String> names) 
	{
		this.names = names;
	}

	//Getter for Address Array
	public ArrayList<String> getAddresses() {
		return addresses;
	}

	//Setter for Address Array
	public void setAddresses(ArrayList<String> addresses) 
	{
		this.addresses = addresses;
	}

	//Getter for Numbers Array
	public ArrayList<String> getNumbers() 
	{
		return numbers;
	}

	//Setter for Numbers Array
	public void setNumbers(ArrayList<String> numbers) 
	{
		this.numbers = numbers;
	}

	//Getter for setting a name
	public String getName() 
	{
		return setName;
	}

	//Setter for setting a name
	public void setName(String setName) 
	{
		this.setName = setName;
	}

	//Getter
	public String getAnswer() 
	{
		return answer;
	}

	//Setter
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}

	//Getter
	public String getNumber() 
	{
		return number;
	}

	//Setter
	public void setNumber(String number) 
	{
		this.number = number;
	}

	//Getter
	public String getAddress() 
	{
		return address;
	}

	//Setter
	public void setAddress(String address) 
	{
		this.address = address;
	}

	//Getter
	public String getUseName() 
	{
		return useName;
	}

	//Setter
	public void setUseName(String useName) 
	{
		this.useName = useName;
	}

	//Getter for Area Code
	public String getUseArea() 
	{
		return useArea;
	}

	//Setter for Area Code
	public void setUseArea(String useArea) 
	{
		this.useArea = useArea;
	}

}
