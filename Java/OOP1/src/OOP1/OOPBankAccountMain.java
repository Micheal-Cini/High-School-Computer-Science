package OOP1;

import java.util.Scanner;

public class OOPBankAccountMain {
	/**
	 * Banking Assignment using OOP
	 * Micheal Cini 
	 */

	public static void main(String[] args) 
	{
		// Initializes objects
		OOPBankAccount user = new OOPBankAccount();
		OOPBankAccount sample1 = new OOPBankAccount("1234", 10000);
		OOPBankAccount sample2 = new OOPBankAccount("4321", 500000);
		
		
		//Setting names for samples
		sample1.setUserName("Micheal");
		sample2.setUserName("Cini");

		
		// Declares Menu and Scanner
		String outputMenu = "menu";
		Scanner input = new Scanner(System.in);

		
		//Creates Welcome statement asking for user input
		System.out.println("Welcome to Micheals Piggy Bank! Would you like to create an account with us? Please enter \"Yes\" or \"No\"");
		String answer = input.nextLine();
		
		
		//Checks User Input
		if (answer.equalsIgnoreCase("yes")) 
		{
			System.out.println("Great! Please enter your name:");
			user.setUserName(input.nextLine()); //Sets the users name
			
			System.out.println("Please enter a password:");
			user.setUserPassword(input.next()); //Sets the users password
			
			System.out.println("Please enter how much you would like to deposit");
			while (!input.hasNextDouble()) 
			{
				//Checks if balance is a number
				System.out.println("Invalid Entry! Please enter a number");
				input.next();
			}
			user.setUserBalance(input.nextDouble()); //Sets user balance

			
			while (outputMenu.equalsIgnoreCase("menu")) 
			{
				//Shows a menu that repeats until a valid option is selected
				System.out.println(
				"Welcome " + user.getUserName() + "! Please Enter The Number For What You Would Like to do: \n "
				+ "1) See Sample Accounts \n "
				+ "2) Make a Deposit \n " 
				+ "3) Make a Withdrawl \n "
				+ "4) Calaculate Monthly Interest \n " 
				+ "5) View Your Account Details");

				String menu;
				menu = input.next();

				
				// Checks if user chose option 1
				while (menu.equals("1")) 
				{
					// Prints sample 1 by using toString
					System.out.println(sample1.toStringAccountDetails());
					System.out.println("");
					//Prints sample 2 by using toString
					System.out.println(sample2.toStringAccountDetails());
					System.out.println("\nTo return to the menu type \"menu\" otherwise type \"exit\"");
					outputMenu = input.next();
					menu = "menu";
				}

				
				// Checks if user chose option 2
				while (menu.equals("2")) 
				{
					// Asks for user input
					System.out.println("Enter The amount you want to deposit:");
					while (!input.hasNextDouble()) 
					{
						//Checks to make sure entry is valid
						System.out.println("Invalid Entry! Please enter a number");
						input.next();
					}
					double DepositAmount = input.nextDouble();
					System.out.println("Enter Your Password:");
					String DepositPassword = input.next();
					user.deposit(DepositAmount, DepositPassword);
					System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
					outputMenu = input.next();
					menu = "menu";
				}

				// Checks if user chose option 3
				while (menu.equals("3")) 
				{
					System.out.println("How much would you like to withdrawl?");
					while (!input.hasNextDouble()) 
					{
						//Checks if entry is valid
						System.out.println("Invalid Entry! Please enter a number");
						input.next();
					}
					double DepositAmount = input.nextDouble();
					//asks user to input password
					System.out.println("Please Enter Your Password:");
					String DepositPassword = input.next();
					user.withdraw(DepositAmount, DepositPassword);
					System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
					outputMenu = input.next();
					menu = "menu";
				}

				//Checks if user chose option 4
				while (menu.equals("4")) 
				{
					//Asks user for rate to generate interest
					System.out.println("Please enter the rate at which you will generate monthly compound interest (In percentage)");
					while (!input.hasNextDouble()) 
					{
						//Checks if entry is valid
						System.out.println("Invalid Entry! Please enter a number");
						input.next();
					}
					double rate = input.nextDouble();
					//Asks user for years to invest
					System.out.println("How many years would you like to invest for?");
					while (!input.hasNextDouble()) 
					{
						//Checks if entry is valid
						System.out.println("Invalid Entry! Please enter a number");
						input.next();
					}
					double years = input.nextDouble();
					//Prints a statement that gets the investment after a specified amount of years and rate
					System.out.println("Your balance of $" + user.getUserBalance()
							+ " after monthly interest at a rate of " + rate + "% for " + years + " year(s) will be $" + user.formatDecimal(user.interestMonthly(rate, years)));
					System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
					outputMenu = input.next();
					menu = "menu";
				}

				//Checks if user chose option 5
				while (menu.equals("5")) 
				{
					//Prints the users account details
					System.out.println(user.toStringAccountDetails());
					System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
					outputMenu = input.next();
					menu = "menu";
				}
			}
		} 
		//If user doesn't enter yes at beginning
		else 
		{
			System.out.println("See you around!");
		}
	}

}
