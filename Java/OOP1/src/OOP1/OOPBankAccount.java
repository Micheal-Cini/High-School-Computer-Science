package OOP1;

import java.text.DecimalFormat;

/**
 * 
 * @author Micheal Cini
 *
 */

public class OOPBankAccount 
	{
		
		// Declares private variables
		private double UserBalance;
		private String UserPassword, UserName;
		private static final double OVERDRAWN_PENALTY = 20;
		
		
		//Constructor
		public OOPBankAccount() 
		{
			this.UserPassword = " ";
			this.UserBalance = 0;
		}
		
		
		// Constructor that receives input from main
		public OOPBankAccount(String password, double balance) 
		{
			this.UserPassword = password;
			this.UserBalance = balance;
		}
		
		
		// Getter for getting UserName
		public String getUserName() 
		{
			return UserName;
		}
	
		
		// Getter for setting UserName
		public void setUserName(String UserName) 
		{
			this.UserName = UserName;
		}
		
		
		// Getter for getting UserPassword
		public String getUserPassword() 
		{
			return UserPassword;
		}
	
		
		// Getter for setting UserPassword
		public void setUserPassword(String UserPassword) 
		{
			this.UserPassword = UserPassword;
		}
	
		
		// Getter for getting UserBalance
		public double getUserBalance() 
		{
			return UserBalance;
		}
		
		
		// Getter for setting UserBalance
		public void setUserBalance(double UserBalance) 
		{
			this.UserBalance = Double.parseDouble(formatDecimal(UserBalance)); //parses UserBalance into a double
		}
	
		
		public void deposit(double amount, String password) 
		{
			//checks to see if passwords match for deposit
			if (getUserPassword().equals(password))
			{
				setUserBalance(getUserBalance() + amount);
				System.out.println("Successfully deposited $" + amount);
			} 
			
			else 
			{
				System.out.println("Incorrect Password!");
			}
		}
	
		
		public void withdraw(double amount, String password) 
		{
			//checks to see if passwords match for withdraw
			if (getUserPassword().equals(password)) 
			{
				//checks is user is withdrawing a valid amount
				if (getUserBalance() >= amount) 
				{
					//sets new user balance
					setUserBalance(getUserBalance() - amount);
					System.out.println("Successfully Withdrew $" + Double.parseDouble(formatDecimal(amount)));
				} 
				
				else 
				{
					//Gives a withdraw penalty is user takes more then balance holds
					setUserBalance(getUserBalance() - (amount + OVERDRAWN_PENALTY));
					System.out.println("Successfully Withdrew $" + Double.parseDouble(formatDecimal(amount)) + " + $"+ Double.parseDouble(formatDecimal(OVERDRAWN_PENALTY)) + " Due to Over Withdrawl");
				}
			}
			
			else 
			{
				System.out.println("Incorrect Password!");
			}
		}
	
		
		//Method for decimal format
		public String formatDecimal(double input) 
		{
			DecimalFormat dec = new DecimalFormat("###.###");
			return dec.format(input);
		}
	
		
		public double interestMonthly(double rate, double years) 
		{
			//Calculates interest given the entered balance, rate(in percentage) and years.
			double interest = getUserBalance() * Math.pow((1 + ((rate / 100) / 12)), 12 * years);
			return interest;
		}
	
		
		//Creates a toString method for showing account details
		public String toStringAccountDetails() 
		{
			return getUserName() + "'s Bank Account: \n" + "User Password: " + UserPassword + "\n" + "User Balance: $"+ UserBalance;
		}
	
		
		public String toStringBalance() 
		{
			return "Balance: " + UserBalance;
		}

	}
