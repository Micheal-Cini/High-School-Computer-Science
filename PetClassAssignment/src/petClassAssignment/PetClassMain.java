package petClassAssignment;

import java.util.Scanner;

class PetClassMain {
	/**
	 * Micheal Cini
	 * PetClass assignment using polymorphism, inheritances, and OOP
	 * 
	 */
	
	public static void main(String[] args) {
		
		//Initializes Object
		Scanner input = new Scanner(System.in);
		
		PetClass pet = new PetClass();
		PetClass fish = new Fish();
		PetClass dog = new Dog();
		PetClass cat = new Cat();
		PetClass snake = new Snake();
		
		//Declaring Menu
		String choice = "menu";
		
		//Runs the menu
		while (choice.equals("menu")) {
			System.out.println("Welcome to Micheal's Pet Library! What Pet Would You Like to Add Information About?\n"
					+ "1) See an Example\n"
					+ "2) Dogs\n"
					+ "3) Cats\n"
					+ "4) Fish\n"
					+ "5) Snakes");
			choice = input.next();
			
			//Checks if the user input was valid
			if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {
				
				//Checks if the user chose option 1
				while (choice.equals("1")) {
					//Prints the default petClass toString
					System.out.println(pet.showToString()
							+ pet.movement() + "\n"
							+ pet.hair() + "\n");
					
					//Asks if user wants to continue
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					input.nextLine();
					pet.setMenuAnswer(input.nextLine());
					if (pet.getMenuAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				
				//Checks if the user chose option 2
				while (choice.equals("2")) {
					//Asks for users input
					System.out.println("What is your Dogs name?");
					input.nextLine();
					dog.setName(input.nextLine());

					//Gets user input and sets it according to the question
					System.out.println("What Activity(ies) Does "+dog.getName()+" like to do?");
					dog.setActivity(input.nextLine());
					System.out.println("What Food Does "+dog.getName()+" like to eat?");
					dog.setFood(input.nextLine());
					System.out.println("What Sound Does "+dog.getName()+" make?");
					dog.setSound(input.nextLine());
					
					//Prints the information for dog
					System.out.println(dog.showToString()
							+ dog.movement() + "\n"
							+ dog.hair() + "\n");
					
					//Asks if user wants to continue
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					pet.setMenuAnswer(input.nextLine());
					if (pet.getMenuAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				
				// Checks if user chooses option 3
				while (choice.equals("3")) {
					//Asks for user input
					System.out.println("What is your Cats name?");
					input.nextLine();
					cat.setName(input.nextLine());//Sets user input

					//Sets user input according to question
					System.out.println("What Activity(ies) Does "+cat.getName()+" like to do?");
					cat.setActivity(input.nextLine());
					System.out.println("What Food Does "+cat.getName()+" like to eat?");
					cat.setFood(input.nextLine());
					System.out.println("What Sound Does "+cat.getName()+" make?");
					cat.setSound(input.nextLine());
					System.out.println(cat.showToString()
							+ cat.movement() + "\n"
							+ cat.hair() + "\n");
					
					
					//Asks if user wants to continue
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					pet.setMenuAnswer(input.nextLine());
					if (pet.getMenuAnswer().equalsIgnoreCase("yes")) 
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
				while (choice.equals("4")) {
					//Asks for user input
					System.out.println("What is your Fishes name?");
					input.nextLine();
					fish.setName(input.nextLine()); //Sets user input

					//Sets user input according to question
					System.out.println("What Activity(ies) Does "+fish.getName()+" like to do?");
					fish.setActivity(input.nextLine());
					System.out.println("What Food Does "+fish.getName()+" like to eat?");
					fish.setFood(input.nextLine());
					System.out.println("What Sound Does "+fish.getName()+" make?");
					fish.setSound(input.nextLine());
					//Prints the information for fish according to input
					System.out.println(fish.showToString()
							+ fish.movement() + "\n"
							+ fish.hair() + "\n");
					
					//Asks user if they want to continue
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					pet.setMenuAnswer(input.nextLine());
					if (pet.getMenuAnswer().equalsIgnoreCase("yes")) 
					{
						choice = "menu";
					}
					else 
					{
						System.out.println("See you around!");
						choice = "null";
					}
				}
				while (choice.equals("5")) {
					//Asks for user input
					System.out.println("What is your Snakes name?");
					input.nextLine();
					snake.setName(input.nextLine()); // Sets user input

					//Sets user input according to question
					System.out.println("What Activity(ies) Does "+snake.getName()+" like to do?");
					snake.setActivity(input.nextLine());
					System.out.println("What Food Does "+snake.getName()+" like to eat?");
					snake.setFood(input.nextLine());
					System.out.println("What Sound Does "+snake.getName()+" make?");
					snake.setSound(input.nextLine());
					//Prints information about snake
					System.out.println(snake.showToString()
							+ snake.movement() + "\n"
							+ snake.hair() + "\n");
					
					//Asks if user wants to continue
					System.out.println("Would you like to return to the menu? Please type \"Yes\" or \"No\"");
					pet.setMenuAnswer(input.nextLine());
					if (pet.getMenuAnswer().equalsIgnoreCase("yes")) 
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
			else {
				System.out.println("Invalid Entry! Please Try Again");
				choice = "menu";
			}
		}
		//closes scanner
		input.close();
	}

}
