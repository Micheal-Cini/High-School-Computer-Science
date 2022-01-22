package petClassAssignment;

//Class Cat which is extended from PetClass
public class Cat extends PetClass {
	
	//toString that shows user inputed information
	public String showToString() {
		return "\nInformation about "+ name + ": \n"
				+ "Species - Cat\n"
				+ "Favourite Activity(ies) - " + activity + "\n"
				+ "Favourite Food - " + food + "\n"
				+ "Sound - " + sound + "\n";
				
	}
	
	//Movement classes that uses polymorphism to be specific to cats
	public String movement() {
		return "Movement - Cats like to stay put";
	}
	
	public String hair() {
		return "Hair/Fur - Cats can have short or long fur";
		
	}
}
