package petClassAssignment;

//Class Snake which is extended from PetClass
public class Snake extends PetClass{

	//toString that shows user inputed information
	public String showToString() {
		return "\nInformation about "+ name + ": \n"
				+ "Species - Snake\n"
				+ "Favourite Activity(ies) - " + activity + "\n"
				+ "Favourite Food - " + food + "\n"
				+ "Sound - " + sound + "\n";
				
	}
	
	//Movement classes that uses polymorphism to be specific to fish
	public String movement() {
		return "Movement - Fish have to swim";
	}
	
	public String hair() {
		return "Hair/Fur - Has no hair/fur, usually has scales";
		
	}
}
