package OOP3;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		// Initializes objects
		TempFunctions temperature = new TempFunctions();
		TempFunctions Sample = new TempFunctions(5, 41);
		
		
		//Setup Menu
		String outputMenu = "menu";
		Scanner input = new Scanner(System.in);
		
		
		//Menu
		while(outputMenu.equalsIgnoreCase("menu")) 
		{
			System.out.println("Welcome to Micheals temperature calculator! Do you want to: \n "
					+ "1)See a Sample Output \n "
					+ "2)Convert Temperature to Fahrenheit \n "
					+ "3)Convert Temperature to Celsius");
			
			//Gets user input
			String menu = input.next();
			
			//Checks to see if user chose option 1
			while(menu.equalsIgnoreCase("1")) 
			{
				
				System.out.println(Sample.toStringTemperature());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="e";
			}
			
			
			//Checks to see if user chose option 2
			while(menu.equalsIgnoreCase("2")) 
			{
				System.out.println("Enter the temperature in degrees celsius");
				temperature.setCelsius(input.nextDouble());
				temperature.toFahrenheit(temperature.getCelsius());
				System.out.println(temperature.toStringTemperature());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="e";
			}
			
			
			//Checks to see if user chose option 3
			while(menu.equalsIgnoreCase("3")) 
			{
				System.out.println("Enter the temperature in degrees fahrenheit");
				temperature.setFahrenheit(input.nextDouble());
				temperature.toCelsius(temperature.getFahrenheit());
				System.out.println(temperature.toStringTemperature());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="e";
			}
			
		}

	}
}
