package searchingSorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class searchingSortingMain {
	/**
	 * 
	 * Micheal Cini
	 * Searching and Sorting Assignment
	 * 
	 */

	//Main Method
	public static void main(String[] args) throws FileNotFoundException {
		
		//Declare/Initialize Objects
		File names = new File("nameList.txt");//Create/Access a file with the specified name
		Scanner inputNames=new Scanner(names);//Allows the specified file to be read
		Scanner input = new Scanner(System.in);//Default Scanner for User input
		
		//Create and Array that will hold Strings
		ArrayList <String> namesArray=new ArrayList<String>();

		//Booleans for menu system
		boolean searchMenu = true;
		boolean sortMenu = true;
		
		//Begins the interface of the code
		System.out.println("Welcome to The Name Machine! Would you like to begin? Please Enter Yes or No");//Asks the user if they want to begin
		if(input.nextLine().equalsIgnoreCase("yes")) {//Checks if user says yes
			System.out.println("Perfect!");
			int check = 0;
			
			//Reading the text file and adding the names to an arrayList
			while (inputNames.hasNextLine()) {//Checks if there is a next line in the text file
				String line = inputNames.nextLine();//Creates a variable to hold the next line in the text file
				namesArray.add(check, line);//Adds that line to an array slot
				check++;
			}
			System.out.println(namesArray);//Prints the array of names in an unsorted order
			
			//1st Menu system
			while(sortMenu) 
			{
			//Asks user how they would like to execute the code
			System.out.println("How would you like to sort the names shown above?\n"
					+ "1) Bubble\n"//Use bubble sorting to sort the array
					+ "2) Insertion");//Use insertion sorting to sort the array
			String sort = input.next();
			
			//Checks which option the user chose
			if (sort.equals("1")) {
				//If user chooses to bubble sort:
				bubbleSort(namesArray);//Runs the bubbleSort method
				System.out.println(namesArray);//Prints the sorted array
				sortMenu=false;//Does not repeat Menu
			}
			else if (sort.equals("2")) {
				//If user chooses to insertion sort:
				insertionSort(namesArray);//Runs the insertionSort method
				System.out.println(namesArray);//Prints the sorted array
				sortMenu=false;//Does not repeat Menu
			}
			else {
				//If user inputs an invalid option
				System.out.println("Invalid Entry! Please Try Again");
			}
			}
			
			//2nd menu system
			while(searchMenu) 
			{
			//Asks the user what name they would like to search for
			System.out.println("What name would you like to search for?");
			String nameSearch = input.next();//Stores that name in a variable
			//Asks user how they would like to execute the code
			System.out.println("What search method would you like to use?\n"
					+ "1) Linear\n"//Use a linear search method
					+ "2) Binary");//Use a binary search method
			String search = input.next();
			
			//Checks which option the user chose
				if(search.equals("1")) 
				{
					//If user chooses to use linear search:
					int index = linearSearch(namesArray, nameSearch);//Runs the linearSearch method with a return statement
					if(index == -1)//If no name is found
					{
						System.out.println("Name not found! Please try again");
					}
					else 
					{//If a name is found
						System.out.println("The name "+nameSearch+" was found at index "+index);//Tells the user the index at which the specified name was found
						searchMenu = false;//Does not repeat menu
					}
				}
				else if(search.equals("2")) {
					//If user chooses Binary Search
					int index = binarySearch(namesArray, nameSearch);//Runs the binarySearch method with a return statement
					if(index == -1) //If no name is found
					{
						System.out.println("Name not found! Please try again");
					}
					else 
					{//If a name is found
						System.out.println("The name "+nameSearch+" was found at index "+index);//Tells the user the index at which the specified name was found
						searchMenu = false;//Does not repeat menu
					}
				}
				else{
					//If user input an invalid option
					System.out.println("Invalid Entry! Please Try Again");
				}
			}
			System.out.println("Converting Names to Characters...");
			toChars(namesArray);//Runs the toChars method to turn the names to characters and print them in their own .txt file
			System.out.println("Reversing Sorted Names...");
			
			
			//Recursion Block
			
			//A try catch block to catch any exceptions found(i.e file not found)
			PrintWriter outputReverse = null;//Declares the PrintWriter variable to write in a text file
			try {
				outputReverse = new PrintWriter(new File("reverseNameList.txt"));//Declare what file will be used to write in
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//Creates a for loop that turns the name at every position in the array to a string to use in the recursion method
			for(int i = 0; i<namesArray.size(); i++) {
				outputReverse.print(reverseNames(namesArray.get(i)));
				outputReverse.println();
				
			}
			outputReverse.close();//Closes the PrintWriter variable
			
			
			//Runs the reverseNames method to print the names in the sorted array in reverse order in their own .txt file
			System.out.println("Done!");
		
		}
		//If user does not chose yes or no
		else {
			System.out.println("Goodbye!");
		}
		
		//Closes the Scanner variables
		input.close();
		inputNames.close();
	}

	
	//reverseNames method
	private static String reverseNames(String reverse){
		
		//Checks if the string is empty
		if (reverse.isEmpty()) {
			return reverse;
		}
		//Re runs the method to reverse the names
		return reverseNames(reverse.substring(1))+reverse.charAt(0);
		
		}
			

	//toChars Method
	private static void toChars(ArrayList<String> namesArray) {
		
		PrintWriter output = null;//Declares the PrintWriter variable to write in a text file
		//A try catch block to catch any exceptions found(i.e file not found)
		try {
			output = new PrintWriter(new File("charNameList.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Creates a nested for loop to read every name in the array and turn every letter into its own character
		for (int i=0; i<namesArray.size(); i++) {
			if (!(i==0)&&!(i==namesArray.size())) {
				output.println();
			}
			for(int j=0; j<namesArray.get(i).length(); j++) {
				char nameChar = namesArray.get(i).charAt(j);
				output.println(nameChar);
			}
		}
		output.close();//Closes the PrintWriter variable
	}

	//insertionSort Method
	private static void insertionSort(ArrayList<String> namesArray) {
		String temp;
		//Creates a nested for loop to read all the names in the names array and sort them in alphabetical order using insertionSort
		for(int i=1; i<namesArray.size(); i++) {
			for(int j=i; j>0; j--) {
				if(namesArray.get(j).compareToIgnoreCase(namesArray.get(j-1))<0) {//Checks if the names are in order or not
					//Sorts them in proper order if not already
					temp = namesArray.get(j);
					namesArray.set(j, namesArray.get(j-1));
					namesArray.set(j-1, temp);
				}
			}
		}
	}
	
	//bubbleSort Method
	private static void bubbleSort(ArrayList<String> namesArray) {
		//Creates a nested for loop to real all the names in the names array and sort them in alphabetical order using bubbleSort
		for(int i=1; i<namesArray.size();i++) {
			for(int j=0; j<namesArray.size(); j++) {
				if(namesArray.get(j).compareToIgnoreCase(namesArray.get(i))>0) {//Checks if the names are in order or not
					swapNamesArray(namesArray, j, i);//Runs the swapNamesArray method
					
				}
			}
		}
		
	}
	
	//swapNamesArray Method
	private static void swapNamesArray(ArrayList<String> namesArray, int j, int i) {
		//Sorts the names if proper order if not already
		String temp=namesArray.get(j);
		namesArray.set(j, namesArray.get(i));
		namesArray.set(i, temp);
		
	}

	//binarySearch Method
	private static int binarySearch(ArrayList<String> namesArray, String nameSearch) {
			//Creates variables to be used in the binary search
			int low = 0;
	        int high = namesArray.size() - 1;
	        int mid;

	        //Creates a while loop to check if the "low" variable is lower then the "high" variable
	        while (low <= high) {
	            mid = (low + high) / 2;//creates a mid variable by adding the low to the high and dividing by 2

	            if (namesArray.get(mid).compareToIgnoreCase(nameSearch) < 0) {//checks if the middle name in the array compared to the speficifed search name is less then 0
	                low = mid + 1;//Makes low=mid+1 because the specified name is not below half
	            } else if (namesArray.get(mid).compareToIgnoreCase(nameSearch) > 0) {//Checks if the middle name in the array compared to the speficifed search name is more then 0
	                high = mid - 1; //Makes high = mid-1 because the specified name is not above half
	            } else {
	                return mid;//The specified name is the middle name
	            }
	        }
	        return -1;//If the name is not found
	    }
	
	//linearSearch Method
	private static int linearSearch(ArrayList<String> namesArray, String nameSearch) {
		//Creates a for loop that checks every string at every index in the namesArray until it finds a match
		for(int i = 0; i<namesArray.size(); i++) {
			if(namesArray.get(i).equalsIgnoreCase(nameSearch)) {
				return i;
			}
		}
		return -1; //If no name is found
	}
	

}
