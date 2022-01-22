package lesson2Assignments;

//Import Classes
import java.util.Scanner;

import java.text.DecimalFormat;


public class PizzaCost {

	public static void main(String[] args) {
		
		//Declares Variables
		int option; 
		double cost, base;
		
		//Calls on to classes
		Scanner scan=new Scanner(System.in);
		String format="##.##";
		DecimalFormat df=new DecimalFormat();
		
		//Prints out welcome statement
		System.out.println("Welcome to Micheal's Pizzeria!");
		System.out.println("What is the diameter of the pizza you would like to order? (In inches)");
		
		//Uses scanner to ask for user input
		option = scan.nextInt();
		
		//Calculates the base cost for a pizza
		base = 0.75 + 1.00;
	
		//Calculates the total cost for a pizza with the given size
		cost = (0.05*option*option) + base;
		
		//Prints out the final cost for a pizza using decimal format
		System.out.println("Your Pizza Will Cost $"+df.format(cost));
			
		
	}

}
