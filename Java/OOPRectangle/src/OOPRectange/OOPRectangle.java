package OOPRectange;

import java.util.Scanner;

public class OOPRectangle 
{

	public static void main(String[] args) 
	{
		
		// Initialize objects
		RectangleMethod sample = new RectangleMethod(2,2,4,8);
		RectangleMethod rectangle = new RectangleMethod();
		
		//Declare Menu and Scanner
		String outputMenu = "menu";
		Scanner input = new Scanner(System.in);
		
		//Welcome Menu using while loops
		while(outputMenu.equalsIgnoreCase("menu")) 
		{
			System.out.println("Welcome to Micheals rectangle extravaganza! What would you like to do? \n "
					+ "1)See a Sample Output \n "
					+ "2)Calculate Perimeter (Cm) \n "
					+ "3)Calculate Area (Cm) \n "
					+ "4)Calculate both area and perimeter (Cm)");
			
      //ask for input
      String menu = input.next();

			
		//if user chooses option 1
		while(menu.equals("1")) 
			{
				//Outputs sample using toStringAll method
				System.out.println(sample.toStringAll());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="menu";
			}
			
			
		//if user chooses option 2
		while(menu.equals("2")) 
			{
				System.out.println("Please enter the length:");
				rectangle.setLength(input.nextDouble());
				System.out.println("PLease enter the width:");
				rectangle.setWidth(input.nextDouble());
				rectangle.perimeter(rectangle.getLength(), rectangle.getWidth());
				rectangle.setPerimeter(rectangle.getPerimeter());
				System.out.println(rectangle.toStringPerimeter());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="menu";
			}
			

		//if user chooses option 3
		while(menu.equals("3")) 
			{
				System.out.println("Please enter the length:");
				rectangle.setLength(input.nextDouble());
				System.out.println("Please enter the width:");
				rectangle.setWidth(input.nextDouble());
				rectangle.area(rectangle.getLength(), rectangle.getWidth());
				rectangle.setArea(rectangle.getArea());
				System.out.println(rectangle.toStringArea());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="menu";
			}
			
			
		//if user chooses option 4
		while(menu.equals("4")) 
			{
				System.out.println("Please enter the length:");
				rectangle.setLength(input.nextDouble());
				System.out.println("Please enter the width:");
				rectangle.setWidth(input.nextDouble());
				rectangle.area(rectangle.getLength(), rectangle.getWidth());
				rectangle.setArea(rectangle.getArea());
				rectangle.perimeter(rectangle.getLength(), rectangle.getWidth());
				rectangle.setPerimeter(rectangle.getPerimeter());
				System.out.println(rectangle.toStringAll());
				System.out.println("To return to the menu type \"menu\" otherwise type \"exit\"");
				outputMenu=input.next();
				menu="menu"; 
			}	
		}
	}
}