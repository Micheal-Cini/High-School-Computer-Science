package petClassAssignment;

//Class Dog which is extended from PetClass
public class Dog extends PetClass{

	//toString that shows user inputed information
	public String showToString() {
		return "\nInformation about "+ name + ": \n"
				+ "Species - Dog\n"
				+ "Favourite Activity(ies) - " + activity + "\n"
				+ "Favourite Food - " + food + "\n"
				+ "Sound - " + sound + "\n";
				
	}
	
	//Movement classes that uses polymorphism to be specific to dogs
	public String movement() {
		return "Movement - Dogs like to run";
	}
	
	public String hair() {
		return "Hair/Fur - Dogs can have either Hair or Fur";
		
	}
}
