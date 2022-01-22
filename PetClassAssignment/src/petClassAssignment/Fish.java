package petClassAssignment;

//Class Fish which is extended from PetClass
public class Fish extends PetClass{

	//toString that shows user inputed information
	public String showToString() {
		return "\nInformation about "+ name + ": \n"
				+ "Species - Fish\n"
				+ "Favourite Activity(ies) - " + activity + "\n"
				+ "Favourite Food - " + food + "\n"
				+ "Sound - " + sound + "\n";
	}
	
	//Movement classes that uses polymorphism to be specific to snakes
	public String movement() {
		return "Movement - Snakes slither on the ground";
	}
	
	public String hair() {
		return "Hair/Fur - Has no hair/fur, usually has scales";
		
	}
}